package Milestone_4.BST;

import Milestone_4.BinaryTree.BinaryTreeNode;
import Milestone_3.LinkedList.LinkedListNode;
import java.util.*;

public class BSTtoLL {
    static ArrayList<Integer> inOrderList = new ArrayList<>();

    public static void inOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        inOrderList.add(root.data);
        inOrder(root.right);
    }

    public static LinkedListNode<Integer> toLinkedList(ArrayList<Integer> arr) {
        LinkedListNode<Integer> head = new LinkedListNode<>(arr.get(0));
        LinkedListNode<Integer> curr = head;
        for (int i = 1; i < arr.size(); i++) {
            LinkedListNode<Integer> temp = new LinkedListNode<>(arr.get(i));
            curr.next = temp;
            curr = curr.next;
        }

        curr.next = null;

        return head;

    }

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        inOrder(root);
        return toLinkedList(inOrderList);
    }
}
