package list.SinglyList;

public class DeleteLinkedList {
    Node head;

    public void delete(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
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

   // 1->2->3->4
     //       1->2->4
    // if(node.next == node3) {
    // node.next = node.next.next;
    // }
    //
    public static void main(String[] args) {
        DeleteLinkedList deleteLinkedList = new DeleteLinkedList();
        deleteLinkedList.head = new Node(1);
        Node node2 = new Node(2);
        deleteLinkedList.head.next = node2;

        Node node3 = new Node(3);
        node2.next = node3;

        Node node4 = new Node(4);
        node3.next = node4;

        deleteLinkedList.delete(node4);

        System.out.println(deleteLinkedList.head);
    }
}
