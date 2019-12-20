package sap.ds.recursion;

public class Fibbonacci {
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            //System.out.print(1 + " \t");
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
            //System.out.print(temp + " \t");
            //return temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
