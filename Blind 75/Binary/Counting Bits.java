package Binary;
class Solution {
    public int[] countBits(int n) {
        // Time: O(n) Space: O(n)
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // Remove i’s lowest‑set bit with (i & (i‑1)), look up its already‑computed bit‑count
            // in ans[], and add 1 to re‑include the bit we just cleared—this gives the total
            // number of 1‑bits in i in O(1) time.
            ans[i] = ans[i & i - 1] + 1;
        }
        return ans;
    }
}