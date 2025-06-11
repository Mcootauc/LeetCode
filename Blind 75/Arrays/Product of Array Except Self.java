class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ansarr = new int[nums.length];
        ansarr[0] = 1;
        int R = 1;
        //prefix
        for (int i = 1; i < nums.length; i++) {
            ansarr[i] = nums[i - 1] * ansarr[i - 1];
        }
        //suffix
        for (int j = nums.length - 1; j > -1; j--) {
            ansarr[j] *= R;
            R *= nums[j];
        }
        return ansarr;
    }
}