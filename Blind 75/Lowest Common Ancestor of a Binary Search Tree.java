/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // keep traversing through the tree until 
        // you get null or the answer
        while (root != null) {
            // if both p and q are LESS than root then the answer 
            // is going to be in the left subtree
            if (p.val < root.val && q.val < root.val) root = root.left;
            // if both p and q are GREATER than root then the answer 
            // is going to be in the left subtree
            else if (p.val > root.val && q.val > root.val) root = root.right;
            // returns the root because the outcomes are p is greater 
            // or less than the root and q is the opposite OR the root is the
            // same value as p or q which means, root is the answer
            else return root; 
        }
        return root;
    }
}