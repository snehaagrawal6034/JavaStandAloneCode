package list.SinglyList;

import java.util.Arrays;
import java.util.List;

public class AddTwoNums {

    public void addTwoNumbers(Node l1, Node l2) {
        int lastcarry = 0;

        Node head = new Node(-1);
        Node dummy = head;

        while (l1 != null || l2 != null) {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            int sum = l1_val + l2_val + lastcarry;
            lastcarry = sum / 10;

            dummy.next = new Node(sum % 10);

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        if (lastcarry > 0) {
            dummy.next = new Node(lastcarry);
        }
    }
    // -1->2->4->3
    public static void main(String[] args) {
        AddTwoNums obj = new AddTwoNums();
        List<Integer> list1 = Arrays.asList(2,4,3);
        List<Integer> list2 = Arrays.asList(5,6,4);
        Node randomNode = new Node(-1);
        Node randomNode2 = new Node(-1);
        Node randomNodeCopy = randomNode;
        Node randomNodeCopy2 = randomNode2;
        for (Integer integer : list1) {
            randomNodeCopy.next = new Node(integer);
            randomNodeCopy = randomNodeCopy.next;
        }
        for (Integer integer : list2) {
            randomNodeCopy2.next = new Node(integer);
            randomNodeCopy2 = randomNodeCopy2.next;
        }

        obj.addTwoNumbers(randomNode.next, randomNode2.next);
    }

    public static class Node {
        int val;
        Node next;
        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        public Node(int data) {
            this.val = data;
        }
    }
}
