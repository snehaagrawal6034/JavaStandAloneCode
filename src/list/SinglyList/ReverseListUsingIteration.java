package list.SinglyList;

import java.util.Arrays;
import java.util.List;

public class ReverseListUsingIteration {
    public Node reverseList(Node head) {

        Node prev = null;
        Node cur = head;

        while(cur!= null){
            Node temp = cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseListUsingIteration obj = new ReverseListUsingIteration();
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
