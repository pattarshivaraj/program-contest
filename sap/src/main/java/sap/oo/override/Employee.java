package sap.oo.override;

public class Employee {
    private int id;
    protected long basic;

    public Employee(int id, long basic) {
        this.id = id;
        this.basic = basic;
    }

    public long calcSalary() {
        System.out.println("Employee: " + basic);
        return basic;
    }
}
