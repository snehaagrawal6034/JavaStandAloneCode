package list.SinglyList;

import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public Node removeElements(Node head, int val) {
        while(head!=null && head.val==val){
            head = head.next;
        }
        Node tmp = head;

        while(tmp != null && tmp.next != null){
            if(tmp.next.val == val){
                tmp.next = tmp.next.next;
            }
            else{
                tmp=tmp.next;
            }
        }
        return head;
        }

    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        List<Integer> list = Arrays.asList(1,2,3,6,6,5,9,6,6);
        Node randomNode = new Node(-1);
        Node randomNodeCopy = randomNode;
        for (Integer integer : list) {
            randomNodeCopy.next = new Node(integer);
            randomNodeCopy = randomNodeCopy.next;
        }

       Node remList = obj.removeElements(randomNode.next,6);
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

