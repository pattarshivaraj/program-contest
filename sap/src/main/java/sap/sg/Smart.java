package sap.sg;

import java.util.*;

class Smart {
    private static Map<Integer, Integer> store = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        List<List<Integer>> ip = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            list.stream().parallel().sorted();
            Collections.reverse(list);
            ip.add(list);
        }

        ip.forEach(list -> {
            Map<Integer, Integer> map = new HashMap<>();
            list.forEach(temp -> {
                int count = getOnes(temp);

                Integer re = map.get(count);
                if (re != null) {
                    if (re > temp)
                        map.put(count, temp);
                } else {
                    map.put(count, temp);
                }
            });
            List<Integer> temp = new ArrayList<>();
            map.values().forEach(v -> {
                temp.add(v);
            });

            temp.forEach(i -> System.out.print(i + " "));

            System.out.println();

        });

    }

    private static int getOnes(int n) {
        int count = 0;
        int temp = n;
        while (temp > 0) {
            if (store.get(temp) != null) {
                count += store.get(temp);
                //return count;
                break;
            } else {
                int tt = temp;
                temp = temp >>> 1;
                int tt1 = temp << 1;
                if (tt1 != tt) {
                    count++; //System.out.println("hi");
                }
                //count += temp % 2;
                //temp = temp >>> 1;
            }
        }
        store.putIfAbsent(n, count);
        return count;
    }
}
