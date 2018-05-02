package sap.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostIpConnectionValidation {
    public static void main(String[] args) {
        InetAddress inet = null;
        String ipAddress = "localhost";
        try {
            inet = InetAddress.getByName(ipAddress);
            if (inet.isReachable(15000)) {
                System.out.println(ipAddress + " is reachable");
            } else {
                System.out.println(ipAddress + " is Not reachable");
            }
        } catch (UnknownHostException e) {
            System.out.println(ipAddress + " is Not reachable");
        } catch (IOException e) {
            System.out.println(ipAddress + " is Not reachable");
        }
    }
}
