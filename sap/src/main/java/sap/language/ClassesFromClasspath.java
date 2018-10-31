package sap.language;

import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ClassesFromClasspath {

    public static void main(String[] args) {
        // find all classes in classpath
        List<Class> allClasses = ClassesFromClasspath.getAllKnownClasses();
        System.out.printf("There are %s classes available in the classpath\n", allClasses.size());

        // find all classes that implement/subclass an interface/superclass
        List<Class> serializableClasses = ClassesFromClasspath.getMatchingClasses(Serializable.class);
        for (Class clazz : serializableClasses) {
            System.out.printf("%s is Serializable\n", clazz);
        }
    }

    public static List<Class> getAllKnownClasses() {
        List<Class> classFiles = new ArrayList<Class>();
        List<File> classLocations = getClassLocationsForCurrentClasspath();
        for (File file : classLocations) {
            classFiles.addAll(getClassesFromPath(file));
        }
        return classFiles;
    }

    public static List<File> getClassLocationsForCurrentClasspath() {
        List<File> urls = new ArrayList<File>();
        String javaClassPath = System.getProperty("java.class.path");
        if (javaClassPath != null) {
            for (String path : javaClassPath.split(File.pathSeparator)) {
                urls.add(new File(path));
            }
        }
        return urls;
    }

    private static Collection<? extends Class> getClassesFromPath(File path) {
        if (path.isDirectory()) {
            return getClassesFromDirectory(path);
        } else {
            return getClassesFromJarFile(path);
        }
    }

    private static List<Class> getClassesFromDirectory(File path) {
        List<Class> classes = new ArrayList<Class>();
        System.out.println("getClassesFromDirectory: Getting classes for " + path);

        // get jar files from top-level directory
        List<File> jarFiles = listFiles(path, new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jar");
            }
        }, false);
        for (File file : jarFiles) {
            classes.addAll(getClassesFromJarFile(file));
        }

        // get all class-files
        List<File> classFiles = listFiles(path, new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".class");
            }
        }, true);

        // List<URL> urlList = new ArrayList<URL>();
        // List<String> classNameList = new ArrayList<String>();
        int substringBeginIndex = path.getAbsolutePath().length() + 1;
        for (File classfile : classFiles) {
            String className = classfile.getAbsolutePath().substring(substringBeginIndex);
            className = fromFileToClassName(className);
            System.out.println("Found class " + className + " in path " + path);
            try {
                classes.add(Class.forName(className));
            } catch (Throwable e) {
                System.out.println("Couldn't create class " + className + "." + e);
            }

        }

        return classes;
    }
    private static List<File> listFiles(File directory, FilenameFilter filter, boolean recurse) {
        List<File> files = new ArrayList<File>();
        File[] entries = directory.listFiles();

        // Go over entries
        for (File entry : entries) {
            // If there is no filter or the filter accepts the
            // file / directory, add it to the list
            if (filter == null || filter.accept(directory, entry.getName())) {
                files.add(entry);
            }

            // If the file is a directory and the recurse flag
            // is set, recurse into the directory
            if (recurse && entry.isDirectory()) {
                files.addAll(listFiles(entry, filter, recurse));
            }
        }

        // Return collection of files
        return files;
    }
    private static String fromFileToClassName(final String fileName) {
        return fileName.substring(0, fileName.length() - 6).replaceAll("/|\\\\", "\\.");
    }
    private static List<Class> getClassesFromJarFile(File path) {
        List<Class> classes = new ArrayList<Class>();
        System.out.println("getClassesFromJarFile: Getting classes for " + path);

        try {
            if (path.canRead()) {
                JarFile jar = new JarFile(path);
                Enumeration<JarEntry> en = jar.entries();
                while (en.hasMoreElements()) {
                    JarEntry entry = en.nextElement();
                    if (entry.getName().startsWith("cxps.events") && entry.getName().endsWith("class")) {
                        String className = fromFileToClassName(entry.getName());
                        System.out.println("\tgetClassesFromJarFile: found " + className);
                        Class claz = Class.forName(className);
                        classes.add(claz);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to read classes from jar file: " + path, e);
        }

        return classes;
    }
    public static List<Class> getMatchingClasses(Class interfaceOrSuperclass) {
        List<Class> matchingClasses = new ArrayList<Class>();
        List<Class> classes = getAllKnownClasses();
        System.out.println("checking " + classes.size() + " classes");
        for (Class clazz : classes) {
            if (interfaceOrSuperclass.isAssignableFrom(clazz)) {
                matchingClasses.add(clazz);
                System.out.println("class " + interfaceOrSuperclass + " is assignable from " +clazz);
            }
        }
        return matchingClasses;
    }

}
