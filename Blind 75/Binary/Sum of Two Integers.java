class Solution {
    public int getSum(int a, int b) {
        // Time: O(1), Space: O(1)
        while (b != 0) { // int b holds the carry bit, if it's 0 then the addition is done
            int temp = (a & b) << 1; // this shifts the 1 left to simulate the carry of the 1
            a = a ^ b; // gets the sum of the binary without the carry
            b = temp; // adds the carry on next pass
        }
        return a;
    }
}