package list.SinglyList;

public class DeleteLinkedList {
    Node head;

    public void delete(Node node) {
        Node hc = head;
        while (hc != null && hc.next != node) {
            hc = hc.next;
        }
        if (hc != null && hc.next != null) {
            hc.next = hc.next.next;
        }
    }
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        DeleteLinkedList deleteLinkedList = new DeleteLinkedList();
        deleteLinkedList.head = new Node(1);
        Node node2 = new Node(2);
        deleteLinkedList.head.next = node2;

        Node node3 = new Node(3);
        node2.next = node3;

        deleteLinkedList.delete(node2);

        System.out.println(deleteLinkedList.head);
    }
}
