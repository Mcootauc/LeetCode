public class Counting Bits {
    class Solution {
        public int hammingWeight(int n) {
            // Time: O(k) k being the number of "set" bits, Space: O(1)
            int sum = 0;
            while (n > 0) {
                n &= n - 1; // gets rid of least sig 1-bit 
                sum++; // increments the sum after removing the least sig 1-bit
            }
            return sum;
        }
    }
}
