package sap.oo;

public class EqualsAndEqualTo {
    public static void main(String[] args) {
        String s1 = new String("shiva");
        String s2 = new String("shiva");

        System.out.println("s1 == s2 -> " + (s1 == s2));
        System.out.println("s1.equlas(s2) -> " + (s1.equals(s2)));

        Employee e1 = new Employee(1);
        Employee e2 = new Employee(1);

        System.out.println("e1 == e2 -> " + (e1 == e2));
        System.out.println("e1.equlas(e2) -> " + (e1.equals(e2)));

    }
    private static class Employee {
        int id;

        public Employee(int id) {
            this.id = id;
        }
    }
}
