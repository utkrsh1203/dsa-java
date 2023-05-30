package Coding_Ninjas.Milestone_4.BinaryTree;

import java.util.*;

public class inputBinaryTree {
    public static BinaryTreeNode<Integer> treeInputEasy() {

        System.out.println("Enter root data : ");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        s.close();
        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        BinaryTreeNode<Integer> leftChild = treeInputEasy();
        BinaryTreeNode<Integer> rightChild = treeInputEasy();

        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static BinaryTreeNode<Integer> treeInputDetailed(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data : ");
        } else {
            if (isLeft) {
                System.out.println("Enter the left child of " + parentData);
            } else {
                System.out.println("Enter the right child of " + parentData);

            }
        }

        try (Scanner s = new Scanner(System.in)) {
            int rootData = s.nextInt();
            // s.close();
            if (rootData == -1) {
                return null;
            }

            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

            BinaryTreeNode<Integer> leftChild = treeInputDetailed(false, rootData, true);
            BinaryTreeNode<Integer> rightChild = treeInputDetailed(false, rootData, false);

            root.left = leftChild;
            root.right = rightChild;

            return root;
        }
    }

    public static BinaryTreeNode<Integer> takeinputLevelWise() {
        try (Scanner s = new Scanner(System.in)) {
            int rootData = s.nextInt();

            if (rootData == -1)
                return null;

            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
            Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
            pendingChildren.add(root);

            while (!pendingChildren.isEmpty()) {
                BinaryTreeNode<Integer> front = pendingChildren.poll();
                System.out.println("Enter left child of " + front.data);
                int left = s.nextInt();
                if (left != -1) {
                    BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                    front.left = leftChild;
                    pendingChildren.add(leftChild);
                }

                System.out.println("Enter right child of " + front.data);
                int right = s.nextInt();
                if (right != -1) {
                    BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
                    front.right = rightChild;
                    pendingChildren.add(rightChild);
                }
            }
            return root;
        }
    }

}
