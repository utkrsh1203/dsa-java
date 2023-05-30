package Coding_Ninjas.Milestone_4.BinaryTree;

import java.util.ArrayList;
import java.util.*;

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class levelWiseLinkedListOfATree {

    public static LinkedListNode<Integer> arrayListToLinkedList(ArrayList<Integer> input) {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> ln = null;
        for (int value : input) {
            if (head == null) {
                head = new LinkedListNode<Integer>(input.get(0));
                ln = head;
            } else {
                ln.next = new LinkedListNode<Integer>(value);
                ln = ln.next;
            }
        }
        return head;
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode<Integer> root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        q.add(root);
        while (q.size() > 0) {
            int size = q.size();
            ArrayList<Integer> li1 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode<Integer> curr = q.poll();
                li1.add(curr.data);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null)
                    q.add(curr.right);
            }
            list.add(li1);
        }
        return list;
    }

    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
        // Write your code here

        ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();

        ArrayList<ArrayList<Integer>> arr = levelOrder(root);

        for (ArrayList<Integer> i : arr) {
            ans.add(arrayListToLinkedList(i));
        }

        return ans;

    }

}