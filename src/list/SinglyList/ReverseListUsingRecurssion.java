package list.SinglyList;

// https://www.youtube.com/watch?v=ugQ2DVJJroc
import java.util.Arrays;
import java.util.List;

class ReverseListUsingRecurssion {

    public Node reverseList(Node head) {
//        if (head == null) {
//            return null;
//        }
//        if (head.next == null) {
//            return head;
//        }
//        Node temp = head.next; // 2,3,4
//        Node reverseSubList = reverseList(temp); // 3 -> 4,3
//        temp.next = head; // 4->3->2
//        head.next = null; // 4->3-> 2-> null
//        return reverseSubList;

        if (head == null || head.next==null) {
            return head;
        }
        Node newNode = reverseList(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newNode;

    }

    public static void main(String[] args) {
        ReverseListUsingRecurssion obj = new ReverseListUsingRecurssion();
        List<Integer> list = Arrays.asList(2,3,4,6);
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
