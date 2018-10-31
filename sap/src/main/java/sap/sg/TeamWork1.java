package sap.sg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TeamWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int match = m / 2;

        List<Node> nodes = new ArrayList<>();

        int temp = 0;
        for (int i = 0; i < match; i++) {
            int p = scanner.nextInt();
            int[] a = new int[p];
            //int[] b = new int[p];
            int ac = 0;
            int bc = 0;
            for (int j = 0; j < p; j++) {
                a[j] = scanner.nextInt();
            }
            for (int j = 0; j < p; j++) {
                temp = scanner.nextInt();
                if (a[j] > temp) {
                    ac++;
                } else if (temp > a[j]) {
                    bc++;
                }
                //b[j] = scanner.nextInt();
            }
            /*for (int j = 0; j < p; j++) {
                if (a[j] > b[j]) {
                    ac++;
                } else if (b[j] > a[j]) {
                    bc++;
                }
            }*/
            nodes.add(new Node(ac, bc));
        }

        nodes.forEach(n -> {
            System.out.println(n);
        });
    }

    private static class Node {
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
    }
}
