package tree;

public class MaxDepth {

    public static class TreeNode {
        int value; // string, long, data type
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
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

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        MaxDepth tree = new MaxDepth();
        TreeNode firstTree = new TreeNode(1);
        firstTree.left = new TreeNode(3);
        firstTree.right = new TreeNode(2);
        TreeNode temp = firstTree.left; // 3
        temp.left = new TreeNode(5);

        TreeNode secondTree = new TreeNode(2);
        secondTree.left = new TreeNode(1);
        temp = secondTree.left;
        temp.right = new TreeNode(4);
        secondTree.right = new TreeNode(3);
        temp = secondTree.right;
        temp.right = new TreeNode(7);
        System.out.println(tree.maxDepth(firstTree));
    }
}

