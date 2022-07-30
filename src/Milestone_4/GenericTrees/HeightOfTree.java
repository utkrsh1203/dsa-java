package Milestone_4.GenericTrees;

public class HeightOfTree {
    public static int getHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int cnt = 1;
        int childHeightMax = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int childHeight = getHeight(root.children.get(i));
            if (childHeight > childHeightMax) {
                childHeightMax = childHeight;
            }
        }
        cnt += childHeightMax;

        return cnt;
    }
}
