package sap.concurrency.countdown;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {
    private final CountDownLatch startSignal;
    private final CountDownLatch doneSignal;
    private static int count = 0;

    Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
        this.startSignal = startSignal;
        this.doneSignal = doneSignal;
    }

    public void run() {
        try {
            startSignal.await();
            doWork();
            doneSignal.countDown();
            System.out.println("count: " + count);
        } catch (InterruptedException ex) {
        } // return;
    }

    void doWork() {
        System.out.println("Worker doing work");
        count++;
    }
}
