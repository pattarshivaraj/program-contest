package sap.designpatterns.singleton;

import java.io.Serializable;

public final class SingleTonClass implements Serializable {
    private static SingleTonClass instance;
    private String message = "Hi";

    private SingleTonClass() {
        this.message = this.message + " Shivaraj";
        System.out.println(this.message);
    }

    public static SingleTonClass getInstance() {
        if (instance == null) {
            synchronized (SingleTonClass.class) {
                if (instance == null) {
                    instance = new SingleTonClass();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}
