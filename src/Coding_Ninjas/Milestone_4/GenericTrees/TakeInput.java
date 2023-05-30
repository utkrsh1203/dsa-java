package Coding_Ninjas.Milestone_4.GenericTrees;

import java.util.*;

public class TakeInput extends PrintTree {
    public static TreeNode<Integer> takeInputRecursively(TreeNode<Integer> root, boolean isRoot) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!isRoot) {
                System.out.println("Enter the root data");
                int rootData = sc.nextInt();
                root = new TreeNode<Integer>(rootData);
            }

            System.out.println("Enter the number of children of " + root.data);
            int n = sc.nextInt();
            ArrayList<TreeNode<Integer>> children = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter child " + (i + 1) + " of " + root.data);
                int x = sc.nextInt();
                TreeNode<Integer> child = new TreeNode<Integer>(x);
                takeInputRecursively(child, true);
                children.add(child);
            }
            root.children = children;
        }
        return root;
    }

    public static TreeNode<Integer> takeInputLevelWise() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the root data");
            int rootData = sc.nextInt();
            TreeNode<Integer> root = new TreeNode<Integer>(rootData);

            Queue<TreeNode<Integer>> q = new LinkedList<>();

            q.add(root);

            while (!q.isEmpty()) {
                TreeNode<Integer> curr = q.poll();
                System.out.println("Enter the no. of children of " + curr.data);
                ArrayList<TreeNode<Integer>> children = new ArrayList<>();

                int n = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    System.out.println("Enter child " + (i + 1) + " of " + curr.data);
                    int x = sc.nextInt();
                    TreeNode<Integer> child = new TreeNode<Integer>(x);
                    children.add(child);
                    q.add(child);
                }
                curr.children = children;
            }

            return root;
        }
    }

    public static void main(String[] args) {
        // TreeNode<Integer> root = takeInputRecursively(null, false);

        TreeNode<Integer> root = takeInputLevelWise();

        printTreeLevelWise(root);

    }
}
// 1
// [2 3 4]
// [] [5 6 7] [10]
// [][8 9][] [11]

// 1 3 2 3 4 0 3 5 6 7 1 10 0 2 8 9 0 1 11 0 0 0
