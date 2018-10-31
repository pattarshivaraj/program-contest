package sap.oo.override;

public class Developer extends Employee {

    public String work = "doCoding";

    public Developer(int id, long basic) {
        super(id, basic);
    }

    public static void method() {
        System.out.println("I am Developer");
    }

    public long calcSalary() throws RuntimeException {
        System.out.println("Developer: " + this.basic);
        return basic + 500;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
