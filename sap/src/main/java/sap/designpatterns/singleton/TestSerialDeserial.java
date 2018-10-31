package sap.designpatterns.singleton;

import java.io.*;

public class TestSerialDeserial {
    public static void main(String[] args) {
        try {
            SingleTonClass instance1 = SingleTonClass.getInstance();
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserailize from file to object
            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));
            SingleTonClass instance2 = (SingleTonClass) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
