package list.SinglyList;

import java.util.Arrays;
import java.util.List;

public class MergeSortArray {

    Node dummy = new Node(-1);
    Node head = dummy;
    public Node mergeSort(Node l1 , Node l2){

        while(l1 != null && l2 != null){
            if(l1.data<l2.data){
                dummy.next = l1;
                l1= l1.next;

            }
            else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        if(l1 != null){
            dummy.next = l1;
        }
        else {
            dummy.next = l2;
        }
        System.out.println(head.next);
        return head.next;
    }

    public static void main(String[] args) {
        MergeSortArray obj = new MergeSortArray();
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(1,2,2,3,4,4);
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
       obj.mergeSort(randomNode.next,randomNode2.next);    // doubt
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
