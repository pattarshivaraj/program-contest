package sap.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CuncMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("shivaraj", "pattar");

        Map<String, String> map1 = new HashMap<>();
        map1.put("shivaraj", "pattar");
    }
}
