package Tree;
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        //use a queue to explore every children (BFS)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            //store queue size because the size is going to 
            //change during the for loop
            int qLen = queue.size(); 
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < qLen; i++) {
                //grab the node that's in front of the queue
                TreeNode currNode = queue.poll();
                if (currNode != null) {
                    //add the current node's children to the 
                    //queue to be explored later 
                    queue.add(currNode.left);
                    queue.add(currNode.right);
                    list.add(currNode.val);
                }
            }
            //don't want add an empty list to the answer
            //linked list so this is a check
            if (!list.isEmpty()) ans.add(list);
        }
        return ans;
    }
}