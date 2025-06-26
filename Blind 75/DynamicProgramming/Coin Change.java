class Solution {
    public int coinChange(int[] coins, int amount) {
        // Time: O(amount * k), Space: O(amount)
        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0; // Need 0 coins for amount 0

        // Build the table from Bottom-up
        for (int i = 1; i <= amount; i++) {
            // Consider each coin denomination
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) { // Only usable if coin value ≤ current target i.
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1); // dp[i - coins[j]] is the fewest coins needed to make the remaining amount after using this coin once. Adding 1 counts the current coin.
                }
            }
        }
        return dp[amount] <= amount ? dp[amount] : -1; // if dp[amount] is > than amount, no solution was found
    }
}