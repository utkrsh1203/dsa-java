package Coding_Ninjas.Milestone_4.GenericTrees;

public class CountNodes {
    public static int countNodes(TreeNode<Integer> root) {
        int count = 1;
        for (var i = 0; i < root.children.size(); i++) {
            int childCount = countNodes(root.children.get(i));
            count += childCount;
        }
        return count;
    }
}
