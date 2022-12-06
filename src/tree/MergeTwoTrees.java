package tree;

public class MergeTwoTrees {

    public static class Node {
        int value; // string, long, data type
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static void main(String[] args) {
        MergeTwoTrees tree = new MergeTwoTrees();
        Node firstTree = new Node(1);
        firstTree.left = new Node(3);
        firstTree.right = new Node(2);
        Node temp = firstTree.left; // 3
        temp.left = new Node(5);

        Node secondTree = new Node(2);
        secondTree.left = new Node(1);
        temp = secondTree.left;
        temp.right = new Node(4);
        secondTree.right = new Node(3);
        temp = secondTree.right;
        temp.right = new Node(7);
        System.out.println(tree.mergeTrees(firstTree, secondTree));
    }

    public Node mergeTrees(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return null;
        } else if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        } else {
            Node finalNode = new Node(root1.value + root2.value);
            finalNode.left = mergeTrees(root1.left, root2.left);
            finalNode.right = mergeTrees(root1.right, root2.right);
            return finalNode;
        }
    }
}
