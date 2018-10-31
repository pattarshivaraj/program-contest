package sap.designpatterns.singleton;

public class TestMain {
    public static void main(String[] args) {
        ThreadTestDemo demo1 = new ThreadTestDemo(20);
        ThreadTestDemo demo2 = new ThreadTestDemo(20);
        ThreadTestDemo demo3 = new ThreadTestDemo(20);
        ThreadTestDemo demo4 = new ThreadTestDemo(20);
        ThreadTestDemo demo5 = new ThreadTestDemo(20);

        Thread t1 = new Thread(demo1);
        Thread t2 = new Thread(demo2);
        Thread t3 = new Thread(demo3);
        Thread t4 = new Thread(demo4);
        Thread t5 = new Thread(demo5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("done");
    }

}
