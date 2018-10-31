package sap.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterOperatingLegacyCode {
    public static void main(String[] args) {
        List <String> l1 = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<Integer>();
        System.out.println(l1.getClass() == l2.getClass());
        System.out.println(loophole(10));
    }
    private static String loophole(Integer x) {
        List<String> ys = new LinkedList<String>();
        List xs = ys;
        xs.add(x); // Compile-time unchecked warning
        return ys.iterator().next();
    }
}
