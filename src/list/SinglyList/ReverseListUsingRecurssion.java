package list.SinglyList;

import java.util.Arrays;
import java.util.List;

class ReverseListUsingRecurssion {

    public Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node temp = head.next; // 2,3,4
        Node reverseSubList = reverseList(temp); // 3 -> 4,3
        temp.next = head; // 4->3->2
        head.next = null; // 4->3-> 2-> null
        return reverseSubList;
    }

    public static void main(String[] args) {
        ReverseListUsingRecurssion obj = new ReverseListUsingRecurssion();
        List<Integer> list = Arrays.asList(1,2,3);
        Node randomNode = new Node(-1);
        Node randomNodeCopy = randomNode;
        for (Integer integer : list) {
            randomNodeCopy.next = new Node(integer);
            randomNodeCopy = randomNodeCopy.next;
        }

        Node revList = obj.reverseList(randomNode.next);
        System.out.println(revList);
    }

    public static class Node {
        int data;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }

        public Node(int data) {
            this.data = data;
        }
    }
}
