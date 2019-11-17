package sap.vymo;

import java.util.Objects;

public class Node<K, V> {
    K key;
    V value;
    Node next;
    Node(){}
    Node(K k, V v){
        this.key = k;
        this.value = v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(key, node.key);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
