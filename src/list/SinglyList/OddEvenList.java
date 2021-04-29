package list.SinglyList;

import java.util.Arrays;
import java.util.List;

public class OddEvenList {

    public Node oddEvenList(Node head) {

        if(head==null){
            return null;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead=even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        OddEvenList obj = new OddEvenList();
        List<Integer> list = Arrays.asList(1,2,3,6,6,5,9,6,6);
        Node randomNode = new Node(-1);
        Node randomNodeCopy = randomNode;
        for (Integer integer : list) {
            randomNodeCopy.next = new Node(integer);
            randomNodeCopy = randomNodeCopy.next;
        }
        OddEvenList.Node remList = obj.oddEvenList(randomNode.next);
        System.out.println(remList);
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
        public Node(int val) {
            this.val = val;
        }
    }
}
