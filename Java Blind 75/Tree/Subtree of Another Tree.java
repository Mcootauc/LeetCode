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
    // first find out if the subRoot is a subTree of the root tree
    // then check if they're the same tree from there
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // if the subroot is null then we got past the leaf with no problem
        if (subRoot == null) return true;
        // if the subroot is not null and the root is, then it's not a sub tree
        if (root == null) return false;
        if (isSameTree(root, subRoot)) return true;
        //check if the subtree is on the left or on the right
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode root, TreeNode subRoot) {
        //reached past the leaf node with no problem
        if (root == null && subRoot == null) return true;
        if (root != null && subRoot != null && root.val == subRoot.val) return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
        return false;
    }
}