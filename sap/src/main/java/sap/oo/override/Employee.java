package sap.oo.override;

public class Employee {
    private int id;
    protected long basic;

    public static void method() {
        System.out.println("I am Employee");
    }

    public Employee(int id, long basic) {
        this.id = id;
        this.basic = basic;
    }

    public long calcSalary() {
        System.out.println("Employee: " + basic);
        return basic;
    }
}
