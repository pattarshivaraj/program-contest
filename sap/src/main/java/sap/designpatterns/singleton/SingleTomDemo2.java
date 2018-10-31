package sap.designpatterns.singleton;

public class SingleTomDemo2 {
    public static void main(String[] args) {
        SingleTonClass s1 = SingleTonClass.getInstance();
        SingleTonClass s2 = SingleTonClass.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
