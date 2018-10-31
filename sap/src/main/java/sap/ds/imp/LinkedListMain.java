package sap.ds.imp;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedListNode list1 = new LinkedListNode();

        list1.addNode(5);
        list1.addNode(4);
        list1.addNode(3);
        list1.addNode(2);
        list1.addNode(1);

        LinkedListNode list2 = new LinkedListNode();

        list2.addNode(4);
        list2.addNode(3);
        list2.addNode(2);
        list2.addNode(1);

        list1.display();
        list2.display();

        list2.addNode(10);
        list2.display();

        list2.deleteNode(3);
        list2.display();

        LinkedListNode res = getResult(list1, list2);
        res.display();

    }

    private static LinkedListNode getResult(LinkedListNode list1, LinkedListNode list2) {
        LinkedListNode res = new LinkedListNode();

        Integer c1 = list1.getCount();
        Integer c2 = list2.getCount();

        if (c1 == c2) {
            res = getTotal(list1, list2);
            return res;
        } else if (c1 > c2) {
            int c = c1 - c2;
            LinkedListNode.Node temp = list1.getNthNode(c);
        }

        return res;
    }

    private static LinkedListNode getTotal(LinkedListNode list1, LinkedListNode list2) {
        return null;
    }
}
