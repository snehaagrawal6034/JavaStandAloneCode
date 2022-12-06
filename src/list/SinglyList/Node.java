package list.SinglyList;

public class Node {
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
