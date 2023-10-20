/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean valid(TreeNode root, long leftBound, long rightBound) {
        //reached past the leaf node
        if (root == null) return true;
        //check if curr root is invalid with given boundaries
        if (root.val <= leftBound || root.val >= rightBound) return false;
        //recursively DFS checking right and left BSTs
        return valid(root.left, leftBound, root.val) && valid(root.right, root.val, rightBound);
    }
}