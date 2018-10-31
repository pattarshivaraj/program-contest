package sap.mt.parkinglot;

public class FourWheeler implements Vehicle {

    ParkingLot parkingLot;

    public FourWheeler(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void entry() {
        try {
            parkingLot.fourWheelerEntry();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exit() {

    }
}
