package Milestone_4.BinaryTree;

public class diameter {
    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int n = height(root.left) + height(root.right) + 1;
        return Math.max(n, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }
}
