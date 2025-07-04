class Solution {
    public int climbStairs(int n) {
        // Time: O(n) goes through each number n times, Space: O(1) Creates three variables

        if (n == 1) return n;
        int prev1 = 1, prev2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = prev1 + prev2; // ways(i) ways to get to i which is ways(i - 1) + ways(i - 2)
            prev1 = prev2; // for the next iteration it prev1 is now ways(i - 1)
            prev2 = temp; // then prev2 is ways(i)
        }
        return prev2; // holds the final answer
    }
}