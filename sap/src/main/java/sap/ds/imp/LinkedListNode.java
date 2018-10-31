package sap.ds.imp;

public class LinkedListNode {

    Node header;

    public static class Node {
        Integer data;
        Node next;

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void addNode(Integer data) {
        Node n = new Node(data, null);
        if (header == null) {
            header = n;
            return;
        }
        Node temp = header;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    public Node deleteNode(Integer i) {
        if (header == null) {
            return null;
        }
        Node temp = header;
        if (temp.data == i) {
            header = header.next;
            return temp;
        }
        Node pre = header;
        temp = header.next;
        while (temp != null && temp.data != i) {
            pre = temp;
            temp = temp.next;
        }
        if (temp != null) {
            pre.next = temp.next;
            return temp;
        }
        return null;
    }

    public Integer getCount() {
        int count = 0;
        Node temp = header;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public Node getNthNode(Integer n) {
        int c = 0;
        if (header == null) {
            return null;
        }
        Node temp = header;
        while (temp != null && c < n) {
            temp = temp.next;
        }
        if (temp != null) {
            return temp;
        }
        return null;
    }

    public void display() {
        System.out.println();
        Node h = header;
        while (h != null) {
            System.out.print(" " + h.data);
            h = h.next;
        }
        System.out.println();
    }

}
