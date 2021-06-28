package generics;

public class LinkedListOld {

    public static void main(String[] args) {
        // int linkedlist
        Node head = new Node(5);
        head.next = new Node(6);
        head.next = new Node("Sdsd");

        // string linkedlist
        Node head2 = new Node("adsds");
        head2.next = new Node("sdsds");

        int sum = 0;
        while (head != null) {
            int data = (int) head.data;
            sum = sum + data;
            head = head.next;
        }
    }

    public static class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }
}

