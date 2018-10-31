package sap.mt.parkinglot;

public class ParkingLot {
    private int twoWheelCapacity;
    private int twoWheelCount;
    private int fourWheelCapacity;
    private int fourWheelCount;

    public void twoWheelerEntry() throws InterruptedException {
        if (twoWheelCount >= twoWheelCapacity) {
            System.out.println("Parking full for two wheelers");
            wait();
        }
        synchronized (this) {
            this.twoWheelCount++;
        }
    }

    public void fourWheelerEntry() throws InterruptedException {
        if (fourWheelCount >= fourWheelCapacity) {
            System.out.println("Parking full for four wheelers");
            wait();
        }
        synchronized (this) {
            this.fourWheelCount++;
        }
    }

}
