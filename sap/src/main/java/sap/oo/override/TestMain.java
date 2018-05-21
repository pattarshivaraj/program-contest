package sap.oo.override;

public class TestMain {
    public static void main(String[] args) {
        Employee e = new Employee(1, 50);
        Employee d = new Developer(2, 50);

        System.out.println(e.calcSalary());
        System.out.println(d.calcSalary());
    }
}
