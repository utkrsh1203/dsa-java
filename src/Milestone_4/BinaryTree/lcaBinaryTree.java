package Milestone_4.BinaryTree;

public class lcaBinaryTree {
     // Best Method
     public BinaryTreeNode<Integer> lowestCommonAncestorBEST(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> p,
               BinaryTreeNode<Integer> q) {

          // base case
          if (root == null || root == p || root == q) {
               return root;
          }
          BinaryTreeNode<Integer> left = lowestCommonAncestorBEST(root.left, p, q);
          ;

          BinaryTreeNode<Integer> right = lowestCommonAncestorBEST(root.right, p, q);
          // result
          if (left == null) {
               return right;
          } else if (right == null) {
               return left;
          } else {// both left and right are not null,we found our result
               return root;
          }
     }

     // Method similar to that of BST

     public boolean find(BinaryTreeNode<Integer> node, BinaryTreeNode<Integer> data) {
          // write your code here
          if (node == null) {
               return false;
          }
          if (node == data) {
               return true;
          }
          return find(node.right, data) || find(node.left, data);
     }

     public boolean findLeft(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> target) {
          if (root == null) {
               return false;
          }
          if (root.data == target.data) {
               return true;
          }

          if (find(root.left, target)) {
               return true;
          }

          return false;
     }

     public BinaryTreeNode<Integer> lowestCommonAncestor(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> p,
               BinaryTreeNode<Integer> q) {
          if (root == null) {
               return root;
          }

          if (root == p || root == q) {
               return root;
          }

          boolean pLeft = findLeft(root, p);
          boolean qLeft = findLeft(root, q);

          System.out.println(pLeft);
          System.out.println(qLeft);

          if (pLeft && qLeft) {
               return lowestCommonAncestor(root.left, p, q);
          }

          else if (!pLeft && !qLeft) {
               return lowestCommonAncestor(root.right, p, q);
          }

          return root;

     }

}