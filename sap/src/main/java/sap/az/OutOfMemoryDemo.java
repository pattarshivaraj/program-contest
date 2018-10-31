package sap.az;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        //Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        while (true) {
            list.add("shivaraj");
        }
    }
}
