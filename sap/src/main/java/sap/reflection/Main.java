package sap.reflection;

import sap.oo.override.Developer;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class d = Developer.class;
        Class d1 = Class.forName("sap.oo.override.Developer");

        Field[] dFields = d.getFields();

        for (Field f : dFields) {
            System.out.println(f.getName() + " " + f.getType());
        }

        Field[] d1Fields = d1.getFields();

        for (Field f : d1Fields) {
            System.out.println(f.getName() + " " + f.getType());
        }
    }
}
