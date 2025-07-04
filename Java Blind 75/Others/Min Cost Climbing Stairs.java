class Solution {
    //Bottom up computation - O(n) time, O(1) space
    public int minCostClimbingStairs(int[] cost) {
        int top = cost.length;
        int first = cost[0];
        int second = cost[1];
        for (int i = 2; i < top; i++) {
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }
        return Math.min(first, second);
    }
}