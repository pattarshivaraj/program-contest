package sap.ds.imp;

public class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static void display(Node h) {
        System.out.println();
        while (h != null) {
            System.out.print(" " + h.data);
            h = h.next;
        }
    }
}
