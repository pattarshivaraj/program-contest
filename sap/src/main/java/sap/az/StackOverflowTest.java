package sap.az;

public class StackOverflowTest {
    public static void main(String[] args) {
        getString();
    }

    private static void getString() {
        String s = "shivaraj";
        getString();
    }

}
