package list.SinglyList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


/////// extra - for practice
public class LinkedList {

    Node head;
    Node tail;
    int counter = 0;

    public LinkedList(int val) {
        this.head = new Node(val);
        counter= 0;
        this.tail = head;
    }

    public void insertNodeAtEnd(int val) {
        if (tail == null) {
            Node newHeadNode = new Node(val);
            head = newHeadNode;
            tail = newHeadNode;
            counter++;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
            counter++;
        }
    }

    public void insertNodeAtStart(int value) {
        if(tail==null)  {
            Node newHeadNode = new Node(value);
            head=newHeadNode;
            tail=newHeadNode;
            counter++;
        } else {
            Node newHeadNode = new Node(value);
            newHeadNode.next = head;
            head = newHeadNode;
            counter++;
        }

    }
    public void insertInMiddle(int value,int nodeVlue) {
        if(head==null){
            return;
        }  else{
            Node newNode= new Node(value);
            Node copy = head;
            while(copy.next!=null && copy.val!=nodeVlue) {
                copy=copy.next;
            }
            if(copy.next!=null){
                Node temp = copy.next;
                copy.next =newNode;
                newNode.next=temp;
                counter++;
            }else if(copy.next==null && copy.val==nodeVlue) {
                copy.next = newNode;
                counter++;
            }
            else return;

        }
    }

    public void removeNodeFirst(int value) {
        if (head == null) {
            return;
        }
        if (head.val == value) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            counter--;
        } else {
            Node copy = head;
            while (copy.next!= null && copy.next.val != value) {
                copy = copy.next;
            }
            if (copy.next != null) {
                copy.next = copy.next.next;
                counter--;
            }
        }

    }

    public int count() {
        return counter;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

    public static void main(String[] args) {
        int[]a = new int[]{1, 2, 5, 6, 7, 8, 2, 9};
        LinkedList linkedList = new LinkedList(a[0]);
        System.out.println(linkedList); // 1
        linkedList.removeNodeFirst(1);
        System.out.println(linkedList); // null
        linkedList.insertNodeAtEnd(1);
        for (int i=1; i<a.length; i++) {
            linkedList.insertNodeAtEnd(a[i]);
        }
        System.out.println(linkedList); // 1, 2, 5, 6, 7, 8, 2, 9
        linkedList.removeNodeFirst(2);
        System.out.println(linkedList); // 1, 5, 6, 7, 8, 2, 9

        linkedList.removeNodeFirst(100);
        System.out.println(linkedList); // 1, 5, 6, 7, 8, 2, 9

        linkedList.removeNodeFirst(1);
        System.out.println(linkedList); // 5, 6, 7, 8, 2, 9

        System.out.println(linkedList.count());
        linkedList.insertNodeAtStart(9);
        System.out.println(linkedList);

        linkedList.removeNodeFirst(9);
        System.out.println(linkedList);

        linkedList.insertInMiddle(11,9);
        System.out.println(linkedList);
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
            this.val = val;
        }
    }

}