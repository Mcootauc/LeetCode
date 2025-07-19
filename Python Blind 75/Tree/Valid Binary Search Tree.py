# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.validateBST(root,  float("-inf"), float("inf"))
    
    def validateBST(self, root, theMin, theMax):
        if not root:
            return True
        if root.val <= theMin or root.val >= theMax:
            return False
        return self.validateBST(root.left, theMin, root.val) and self.validateBST(root.right, root.val, theMax)
