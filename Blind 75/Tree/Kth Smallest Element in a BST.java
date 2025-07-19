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
    // Time: O(k) kth element is found
    // Space: O(h) height of tree
    int ansNum = 0, count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        traversalHelper(root);
        return ansNum;
    }

    public void traversalHelper(TreeNode root) {
        if (root.left != null) traversalHelper(root.left);
        count--;
        if (count == 0) {
            ansNum = root.val;
            return;
        }
        if (root.right != null) traversalHelper(root.right);
    }
}