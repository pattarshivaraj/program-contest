package sap.az;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    private int i;
    private String s;

    public static void main(String[] args) {
        Set<SetDemo> set = new HashSet<>();
        set.add(new SetDemo());
        set.add(new SetDemo());
        set.add(new SetDemo());
        set.add(new SetDemo());

        System.out.println(set.size());
    }
}
