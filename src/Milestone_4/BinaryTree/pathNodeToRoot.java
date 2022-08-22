package Milestone_4.BinaryTree;

import java.util.*;

public class pathNodeToRoot extends inputBinaryTree {
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

    static ArrayList<Integer> arr = new ArrayList<>();

    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> node, int data) {
        // write your code here
        if (node == null) {
            return arr;
        }
        if (node.data == data) {

            arr.add(node.data);
            return arr;
        }

        if (find(node.left, data)) {
            nodeToRootPath(node.left, data);
            arr.add(node.data);
            return arr;
        }
        if (find(node.right, data)) {
            nodeToRootPath(node.right, data);
            arr.add(node.data);
            return arr;
        }

        return arr;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeinputLevelWise();
        nodeToRootPath(root, 40);
        System.out.println(arr);
    }
}
