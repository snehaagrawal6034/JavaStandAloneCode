package generics;

import java.util.StringJoiner;

// 5 -> 10
// LinkedList of Integer
public class LinkedList {

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        System.out.println(head.data);

        // LinkedList of string
        StringNode head2 = new StringNode("assd");
        head2.next = new StringNode("Sdsds");
        System.out.println(head2.data);
    }


    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class StringNode {
        String data;
        StringNode next;

        public StringNode(String data) {
            this.data = data;
        }
    }

    // TODO - anonymous inner class, static inner class, inner class
}
