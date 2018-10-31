package sap.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflectionMain {
    public static void main(String[] args) {
        SingleTonClass s1 = SingleTonClass.getInstance();
        System.out.println(s1.hashCode());

        SingleTonClass s2 = null;

        Class klass = SingleTonClass.class;
        try {
            Constructor[] constructors = klass.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                s2 = (SingleTonClass) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s2.hashCode());
    }
}
