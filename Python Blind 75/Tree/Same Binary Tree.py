# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        # Time: O(n), Space: O(n), n being the number of nodes in the tree
        if not p and not q: return True
        if p and not q or not p and q or p.val != q.val: return False 
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)