package list.DoublyList;

public class DeleteLinkedListDoubly {
    Node head;
    public void delete(int value) {

    }

    public void delete(Node node) {
        node.prev.next = node.next;
    }

    static class Node {
        int data;
        Node next;
        Node prev;

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
        DeleteLinkedListDoubly deleteLinkedList = new DeleteLinkedListDoubly();
        Node node1 = new Node(1);
        deleteLinkedList.head = node1;

        Node node2 = new Node(2);
        node2.prev = deleteLinkedList.head;
        node1.next = node2;

        Node node3 = new Node(3);
        node2.next = node3;
        node3.prev = node2;

        Node curr = node3;
        for (int i = 4; i < 15; i++) {
            Node node = new Node(i);
            curr.next = node;
            node.prev = curr;
            curr = node;
        }

        deleteLinkedList.delete(node2);

        System.out.println(deleteLinkedList.head);
    }
}
