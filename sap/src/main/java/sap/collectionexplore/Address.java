package sap.collectionexplore;

public class Address {
    int num;
    String address;

    public Address(int num, String address) {
        this.num = num;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "num=" + num +
                ", address='" + address + '\'' +
                '}';
    }
}
