# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
        # Time: O(h), Space: O(h)
        if not root: return None # went past the leaf node
        if root.val > q.val and root.val > p.val: return self.lowestCommonAncestor(root.left, p, q) # both p and q val are less than root so the LCA is on the left side of the tree
        if root.val < q.val and root.val < p.val: return self.lowestCommonAncestor(root.right, p, q) # both p and q val are more than root so the LCA is on the right side of the tree
        return root
