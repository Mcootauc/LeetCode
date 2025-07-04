class Solution {
    public int missingNumber(int[] nums) {
        // Time O(n) Runs through each number in the array nums, Space: O(1) creates one variable missingNum
        int missingNum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missingNum ^= nums[i] ^ i; // This XOR operators compares with all the numbers in the array plus the missing num since the for loop iterates through each number and gets the unique number
        }
        return missingNum;
    }
}