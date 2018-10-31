package sap.mt.timer;

import java.sql.Timestamp;

public class TimerThread implements Runnable {

    private long value;
    private long lapse;
    private boolean intrupt;

    public void setIntrupt(boolean intrupt) {
        this.intrupt = intrupt;
    }

    @Override
    public void run() {
        this.value = System.currentTimeMillis();
        this.lapse = 0;
        while (true){
            if (this.intrupt) {
                System.out.println("Time: " + new Timestamp(this.value));
                System.out.println("Laps: " + this.lapse + "ms");
                this.lapse = 0;
                this.intrupt = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.lapse += 1000;
            this.value += 1000;
        }
    }
}
