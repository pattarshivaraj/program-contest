package sap.vymo;

public class MyList<K, V> {
    Node head;
    Node next;
    public void add(Node<K, V> n) {
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }
    public Node remove(Node n) {
        Node local = null;
        if (head == null) {
            return null;
        }
        Node temp = head;
        if(temp.equals(n)){
            head = head.next;
            return  temp;
        }

        while(temp.next!= null){
            if( temp.next.equals(n)) {
                local = temp;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return local;
    }
    public Node get(Node n) {
        if (head == null) {
            return null;
        }
        Node temp = head;

        while(temp!= null){
            if(temp.equals(n)){
               return temp;
            }
            temp = temp.next;
        }
        return temp;
    }
}
