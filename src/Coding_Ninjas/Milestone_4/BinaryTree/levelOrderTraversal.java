package Coding_Ninjas.Milestone_4.BinaryTree;

import java.util.*;

public class levelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode<Integer> root) {
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
}
