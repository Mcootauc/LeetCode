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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // false if
        //     - pval and qval not the same
        //     - left or right children are null and the other isnt 
        
        // true if
        //     - both null

        // isSame tree if 
        //     - value is the same
        
        if (p == null && q == null) {
            return true;
        // first and second conditional has to check if they're null so the vals can be 
        // checked in the last conditional
        } else if (p == null && q != null || p != null && q == null || p.val != q.val) {
            return false;
        }
        //checks if the left sub tree is the same as the right sub tree
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}