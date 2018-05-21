package sap.oo.overload;

public class Employee {
    public static void add(int a, int b) {
        System.out.println("sum " + (a + b));
    }

    public long add(long a, long b) {
        System.out.println("sum " + (a + b));
        return (a + b);
    }

    public String add(String a, String b) throws Exception {
        System.out.println("sum " + (a + b));
        return (a + b);
    }

    public static void main(String[] args) {
        add(1,2);
    }
}
