package sap.processbuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RedirectDemo {
    public static void main(String[] args) {
        List<String> commad1 = new ArrayList<>();
        commad1.add("ls");
        commad1.add("-lrt");

        List<String> commad2 = new ArrayList<>();
        commad2.add("grep");
        commad2.add("error");

        ProcessBuilder processBuilder1 = new ProcessBuilder(commad1);
        ProcessBuilder processBuilder2 = new ProcessBuilder(commad2);

        processBuilder1.directory(new File("/home/shivaraj/test"));
        processBuilder2.directory(new File("/home/shivaraj/test"));


    }
}
