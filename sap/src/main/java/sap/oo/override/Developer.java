package sap.oo.override;

public class Developer extends Employee {
    public Developer(int id, long basic) {
        super(id, basic);
    }

    public long calcSalary() throws RuntimeException {
        System.out.println("Developer: " + this.basic);
        return basic + 500;
    }
}
