# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """
        # Time: O(n), Space: O(n)
        res = []

        q = collections.deque()
        q.append(root) # start the queue with the root

        while q: # queue is not empty
            qLen = len(q) # counts each node in the level
            level = []
            for i in range(qLen): # go through each node in the level
                currNode = q.popleft()
                if currNode: # currNode could be null and we wouldn't want to append a null node
                    q.append(currNode.left)
                    q.append(currNode.right)
                    level.append(currNode.val)
            if level: # level could be empty and we don't want to append an empty list
                res.append(level)
        return res
