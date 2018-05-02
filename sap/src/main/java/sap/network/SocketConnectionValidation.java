package sap.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketConnectionValidation {
    public static void main(String[] args) {
        String addr = "localhost";
        int openPort = 8082;
        try (Socket soc = new Socket()) {
            soc.connect(new InetSocketAddress(addr, openPort), 15000);
            System.out.println("some other application is running on " + addr + ":" + openPort);
        } catch (IOException ex) {
            System.out.println( addr + ":" + openPort + " is free ");
        }
    }
}
