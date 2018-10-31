package sap.ds.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainTest {
    public static void main(String[] args) {
        Node h1 = new Node(5, null);
        Node h2 = new Node(4, null);
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(2);
        list2.add(1);
        populateList(h1, list1, 0);
        populateList(h2, list2, 0);

        Node.display(h1);
        Node.display(h2);

        Node h = getSum(h1, h2);
        System.out.println();
        System.out.println("Result");
        Node.display(h);
    }

    private static Node getSum(Node h1, Node h2) {
        Node p1 = h1;
        Node p2 = h2;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> res = new Stack<>();

        while (p1 != null) {
            s1.push(p1.data);
        }

        while (p2 != null) {
            s2.push(p2.data);
        }

        int q = 0;
        while (!s1.empty() && !s2.empty()) {
            int temp = s1.pop() + s2.pop() + q;
            q = temp / 10;
            temp = temp % 10;
            res.push(temp);
        }

        if (!s1.empty()) {
            int temp = s1.pop() + q;
            q = temp / 10;
            temp = temp % 10;
            res.push(temp);
            if (q != 0) {
                res.push(q);
            }
        }
        if (!s2.empty()) {
            int temp = s2.pop() + q;
            q = temp / 10;
            temp = temp % 10;
            res.push(temp);
            if (q != 0) {
                res.push(q);
            }
        }


        return null;
    }

    private static Node populateList(Node h, List<Integer> list, int i) {
        if (list.size() <= i)
            return null;
        Node temp = new Node(list.get(i), null);
        h.next = temp;
        populateList(temp, list, ++i);
        return h;
    }
}
