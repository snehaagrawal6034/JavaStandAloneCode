package generics;

public class LinkedListGenerics {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(1);

        Node<String> head2 = new Node<>("Sdsds");

        int sum = 0;
        while (head != null) {
            sum = sum + head.data;
            head = head.next;
        }

    }
    // T is same as T extends Object
    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
