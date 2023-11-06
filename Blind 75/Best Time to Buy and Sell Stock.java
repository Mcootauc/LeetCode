class Solution {
    public int maxProfit(int[] prices) {
        // Time O(n)
        // Because it iterates through the array once of n length

        // Space O(1)
        // Because the space stays the same regardless of prices length
        int lowest = Integer.MAX_VALUE;
        int maxProf = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowest) {
                lowest = prices[i];
            }
            maxProf = Math.max(maxProf, prices[i] - lowest);
        } 
        return maxProf;
    }
}