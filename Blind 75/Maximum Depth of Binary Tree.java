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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        //add 1 to each time you call the function so it simulates a DFS
        int leftCount = maxDepth(root.left) + 1;
        int rightCount = maxDepth(root.right) + 1;
        return Math.max(leftCount, rightCount);
    }
}