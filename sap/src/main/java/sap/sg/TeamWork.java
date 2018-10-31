package sap.sg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TeamWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int match = scanner.nextInt() / 2;

        List<String> list = new ArrayList<>();

        int temp;
        int[] a;
        for (int i = 0; i < match; i++) {
            int p = scanner.nextInt();
            a = new int[p];
            for (int j = 0; j < p; j++) {
                a[j] = scanner.nextInt();
            }
            int ac = 0;
            int bc = 0;
            for (int j = 0; j < p; j++) {
                temp = scanner.nextInt();
                if (a[j] > temp) {
                    ac++;
                } else if (temp > a[j]) {
                    bc++;
                }
            }
            list.add("" + ac + " " + bc);
        }
        //System.out.println(list.stream());
        list.forEach(n -> {
            System.out.println(n);
        });
    }

    /*private static class Node {
        int data1;
        int data2;

        public Node(int data1, int data2) {
            this.data1 = data1;
            this.data2 = data2;
        }

        @Override
        public String toString() {
            return "" + data1 + " " + data2;
        }
    }*/
}
