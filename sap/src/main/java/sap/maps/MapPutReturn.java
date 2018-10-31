package sap.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPutReturn {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        System.out.println(map);
        System.out.println(map.size());

        map.put(map.put(20, 200),2000);
        System.out.println(map);
        System.out.println(map.size());

        map.put(map.put(3, 40), 3000);
        System.out.println(map);
        System.out.println(map.size());

    }
}
