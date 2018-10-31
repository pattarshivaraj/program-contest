package sap.collectionexplore;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Person p1 = new Person(1, "shivaraj1");
        Person p2 = new Person(2, "shivaraj2");
        Person p3 = new Person(3, "shivaraj3");
        Person p4 = new Person(4, "shivaraj4");
        Person p5 = new Person(5, "shivaraj5");
        Person p6 = new Person(6, "shivaraj6");
        Person p7 = new Person(7, "shivaraj7");
        Person p8 = new Person(8, "shivaraj8");
        Person p9 = new Person(9, "shivaraj9");

        Address a1 = new Address(1, "blr1");
        Address a2 = new Address(2, "blr2");
        Address a3 = new Address(3, "blr3");
        Address a4 = new Address(4, "blr4");
        Address a5 = new Address(5, "blr5");
        Address a6 = new Address(5, "blr6");
        Address a7 = new Address(5, "blr7");
        Address a8 = new Address(5, "blr8");
        Address a9 = new Address(5, "blr9");

        Map<Person, Address> map = new HashMap<>();
        map.put(p1, a1);
        map.put(p2, a2);
        map.put(p3, a3);
        map.put(p4, a4);
        map.put(p5, a5);
        map.put(p6, a6);
        map.put(p7, a7);
        map.put(p8, a8);
        map.put(p9, a5);

        System.out.println(map.size());
        System.out.println(map);
        Object p  = null;

    }
}
