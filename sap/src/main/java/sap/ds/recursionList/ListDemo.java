package sap.ds.recursionList;

public class ListDemo {
    public static void main(String[] args) {
        Node n = new Node('a');
        Node.addNode(n,'b');
        Node.addNode(n,'c');
        Node.addNode(n,'d');
        Node.addNode(n,'c');
        Node.addNode(n,'b');
        Node.addNode(n,'a');

        System.out.println(Node.isReverse(n));
    }
}
