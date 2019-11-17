package sap.vymo;

public class Demo {
    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap(4);

        myMap.put(1,"abcd1");
        myMap.put(2, "abcd2");
        myMap.put(3, "abcde");
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(2));
        myMap.delete(2);
        System.out.println(myMap.get(3));
        myMap.put(4, "abcd3");
        System.out.println(myMap.get(2));
        System.out.println(myMap.get(3));
    }
}
