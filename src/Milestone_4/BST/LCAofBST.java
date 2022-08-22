package Milestone_4.BST;

import Milestone_4.BinaryTree.BinaryTreeNode;

public class LCAofBST {
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if (root == null) {
            return -1;
        }

        if (root.data == a || root.data == b) {
            return root.data;
        }

        if (root.data > b && root.data > a) {
            return getLCA(root.left, a, b);
        } else if (root.data < b && root.data < a) {
            return getLCA(root.right, a, b);
        } else {
            return root.data;
        }

    }
}
