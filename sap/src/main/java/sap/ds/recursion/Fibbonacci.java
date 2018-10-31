package sap.ds.recursion;

public class Fibbonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            System.out.print(1 + " \t");
            return 1;
        } else {
            int temp = fib(n - 1) + fib(n - 2);
            System.out.print(temp + " \t");
            return temp;
        }
    }

    public static void main(String[] args) {
        fib(4);
    }
}
