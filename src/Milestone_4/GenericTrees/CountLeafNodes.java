package Milestone_4.GenericTrees;

public class CountLeafNodes {
    static int leafNodes = 0;

    public static int countLeafNodes(TreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }
        if (root.children.size() == 0) {
            leafNodes++;
        }
        for (int i = 0; i < root.children.size(); i++) {
            countLeafNodes(root.children.get(i));
        }

        return leafNodes;

    }
}
