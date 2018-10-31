package sap.sg;

import java.util.*;

class Smart1 {
    private static Map<Integer, Integer> store = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        List<List<Integer>> ip = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            String ss = scanner.nextLine();
            String[] strings = ss.split(" ");

            for (String s : strings) {
                if (!s.isEmpty())
                    list.add(Integer.parseInt(s));
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
                count += temp % 2;
                temp = temp / 2;
            }
        }
        store.putIfAbsent(n, count);
        return count;
    }
}
