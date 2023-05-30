package Coding_Ninjas.Milestone_4.BST;

class BinaryTreeNode<T> {

    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

}

class LargestBstReturn {
    int size;
    int max;
    int min;

    public LargestBstReturn(int size, int max, int min) {
        this.size = size;
        this.max = max;
        this.min = min;
    }
}

public class LargestBST {
    public static LargestBstReturn helper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            LargestBstReturn ans = new LargestBstReturn(0, Integer.MIN_VALUE, Integer.MAX_VALUE);

            return ans;

        }

        LargestBstReturn left = helper(root.left);
        LargestBstReturn right = helper(root.right);

        if (root.data > left.max && root.data <= right.min) {
            LargestBstReturn ans = new LargestBstReturn(1 + Math.max(left.size, right.size),
                    Math.max(root.data, Math.max(left.max, right.max)),
                    Math.min(root.data, Math.min(left.min, right.min)));
            return ans;

        }

        LargestBstReturn ans = new LargestBstReturn(Math.max(left.size, right.size), Integer.MAX_VALUE,
                Integer.MIN_VALUE);

        return ans;

    }

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        // Write your code here
        LargestBstReturn ans = helper(root);
        return ans.size;
    }
}
