package tree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {

    static class Node {
        public int val;
        public List<Node> children;

        public Node(int _val) {
            val = _val;
            children = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();

        for (Node i : root.children) {
                list.addAll(postorder(i));
            System.out.println(list);
        }
        list.add(root.val);
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        PostorderTraversal tree = new PostorderTraversal();
//        tree.postorder();

        Node root = new Node(1);
        Node temp = root;
        temp.children.add(new Node(3));
        temp.children.add(new Node(2));
        temp.children.add(new Node(4));
        temp = temp.children.get(0); //3
        temp.children.add(new Node(5));
        temp.children.add(new Node(6));
        tree.postorder(root);
    }
}


