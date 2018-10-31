package sap.oo.override;

import java.util.HashMap;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 50);
        Employee e2 = new Developer(2, 50);
        Developer d1 = new Developer(2, 50);

        System.out.println(e1.calcSalary());
        System.out.println(e2.calcSalary());

        e1.method();
        e2.method();
        d1.method();

        Map<String, Integer> map = new HashMap<>();
        map.put("shivaraj", 1);
    }
}
