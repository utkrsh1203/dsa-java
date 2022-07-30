package Milestone_4.BinaryTree;

import java.util.*;

public class printTreeMethods {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        // Your code goes here

        if (root == null)
            return;

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                BinaryTreeNode<Integer> remNode = queue.poll();
                System.out.print(remNode.data + " ");

                if (remNode.left != null)
                    queue.add(remNode.left);
                if (remNode.right != null)
                    queue.add(remNode.right);
            }
            System.out.println();
        }
    }

    public static void printDetailedTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " : ");
        if (root.left != null) {
            System.out.print("Left - " + root.left.data + " , ");
        }
        if (root.right != null) {
            System.out.print("Right - " + root.right.data + " , ");
        }
        System.out.println();
        printDetailedTree(root.left);
        printDetailedTree(root.right);
    }
}
