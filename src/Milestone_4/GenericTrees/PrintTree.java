package Milestone_4.GenericTrees;

import java.util.*;

public class PrintTree {

    public static void printTreePreOrder(TreeNode<Integer> root) {
        // this is not base case but a special case if root is null
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        // FOR loop itself becomes a base case.. Recursive calls will stop
        // when root has no children

        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);
            printTreePreOrder(child);
        }
    }

    public static void printTreeDetailed(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " : ");
        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data + " ");
        }
        System.out.println();

        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);
            printTreeDetailed(child);
        }
    }

    public static void printTreeLevelWise(TreeNode<Integer> root) {

        Queue<TreeNode<Integer>> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode<Integer> curr = q.poll();
            if (curr == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {

                System.out.print(curr.data + " ");
                for (int i = 0; i < curr.children.size(); i++) {
                    q.add(curr.children.get(i));
                }
            }

        }

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(3);
        TreeNode<Integer> node3 = new TreeNode<>(4);
        TreeNode<Integer> node4 = new TreeNode<>(5);
        TreeNode<Integer> node5 = new TreeNode<>(6);
        TreeNode<Integer> node6 = new TreeNode<>(7);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node2.children.add(node4);
        node2.children.add(node5);

        node3.children.add(node6);

        printTreeDetailed(root);
    }
}
