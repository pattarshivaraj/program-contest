package sap.oo.singleton;

public class SingleTon {

    private static SingleTon singleTon;
    private String msg;

    private SingleTon() {
        msg = "First Message";
    }

    public static SingleTon getSingleTon() {
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                singleTon = new SingleTon();
            }
        }
        return singleTon;
    }
}
