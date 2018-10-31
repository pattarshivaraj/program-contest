package sap.mt.timer;

import java.util.Scanner;

public class TimerDemo {
    public static void main(String[] args) {
        TimerThread tm = new TimerThread();
        Thread t1 = new Thread(tm);
        Scanner s = new Scanner(System.in);
        t1.start();
        while (true) {
            s.nextLine();
            tm.setIntrupt(true);
        }
    }
}
