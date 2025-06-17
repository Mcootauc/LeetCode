public class Reverse Bits {
    
}
public class Solution {
    // Time: O(1) Space: O(1)
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0, power = 31;

        while (n != 0) {
            ans += (n & 1) << power;    // the & 1 checks if the least sig bit is a 1 or a 0 and the << power places that number into the specific bit starting with the most sig bit
            power--; // sets up the next bit placement to be the right of the last one until it reaches the least sig bit
            n = n >>> 1; // shifts the whole unsigned int to the right until it is 0
        }
        return ans;
    }
}