package sap.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsAndSubTyping {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        List<Object> lo = new ArrayList<>();
        //List<String> ls = lo;
        lo.add(new Object());
        lo.add(new Object());
        lo.add(new Object());
        lo.add(new Object());
        lo.add(new Object());

        ls.add("shivaraj1");
        ls.add("shivaraj2");
        ls.add("shivaraj3");
        ls.add("shivaraj4");
        ls.add("shivaraj5");

        //printCollection(ls);
        printCollection(lo);
        printCollection1(ls);
        printCollection1(lo);

        Collection<?> c = new ArrayList<String>();
        c.add(null); // Compile time error


    }

    private static void printCollection(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    private static void printCollection1(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
}
