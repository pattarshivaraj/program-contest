package sap.concurrency;

public class TestThread extends Thread {

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();

        //t1.start();
        //t2.start();
        t1.run();
        t2.run();
    }
}
