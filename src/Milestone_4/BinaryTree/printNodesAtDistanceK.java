package Milestone_4.BinaryTree;

import java.util.*;

public class printNodesAtDistanceK {

    public static boolean find(BinaryTreeNode<Integer> node, int data) {
        // write your code here
        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        }
        return find(node.right, data) || find(node.left, data);
    }

    static ArrayList<BinaryTreeNode<Integer>> arr = new ArrayList<>();

    public static ArrayList<BinaryTreeNode<Integer>> nodeToRootPath(BinaryTreeNode<Integer> node, int data) {
        // write your code here
        if (node == null) {
            return arr;
        }
        if (node.data == data) {

            arr.add(node);
            return arr;
        }

        if (find(node.left, data)) {
            nodeToRootPath(node.left, data);
            arr.add(node);
            return arr;
        }
        if (find(node.right, data)) {
            nodeToRootPath(node.right, data);
            arr.add(node);
            return arr;
        }

        return arr;
    }

    static List<Integer> ans = new ArrayList<>();

    public static void printKLevelsDown(BinaryTreeNode<Integer> node, BinaryTreeNode<Integer> avoid, int k) {
        // write your code here
        if (node == null) {
            return;
        }
        if (node == avoid) {
            return;
        }
        if (k == 0) {

            ans.add(node.data);
            return;
        }

        printKLevelsDown(node.left, avoid, k - 1);
        printKLevelsDown(node.right, avoid, k - 1);

    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        // Your code goes here
        nodeToRootPath(root, node);
        printKLevelsDown(arr.get(0), null, k);
        for (int i = 1; i < arr.size(); i++) {
            printKLevelsDown(arr.get(i), arr.get(i - 1), k - i);
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}