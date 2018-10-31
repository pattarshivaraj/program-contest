package sap.designpatterns.singleton;

public class ThreadTestDemo implements Runnable {

    int i;

    public ThreadTestDemo(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (i > 0) {
            SingleTonClass singleTonClass = SingleTonClass.getInstance();
            System.out.println(singleTonClass.hashCode());
            i--;
        }
    }
}
