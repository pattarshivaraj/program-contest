package sap.ds.recursionList;

public class Node {
    public char c;
    public Node next;

    public Node(char c) {
        this.c = c;
        this.next = null;
    }

    public static Node addNode(Node temp, char c) {
        Node head = temp;
        Node node = new Node(c);
        if (temp == null) {
            temp = node;
            return temp;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    public static boolean isReverse(Node node) {
        int n = getLength(node);
        return isReverse1(node, (n / 2));
    }

    private static boolean isReverse1(Node node, int n) {
        char c = node.c;
        boolean flag = true;
        if (n > 0) {
            flag = flag && isReverse1(node.next, n - 1);
        }
        node = node.next;
        if (c != node.c)
            flag = false;
        return flag;
    }

    private static int getLength(Node node) {
        int c = 0;
        while (node != null) {
            c++;
            node = node.next;
        }
        return c;
    }
}
