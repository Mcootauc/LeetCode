class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Time O(n):
        // Because it is only a one pass through the array

        // Space O(1):
        // Because the amount of variables stays the same no 
        // matter the length of the inputs

        // key is the number at index and value is the index itself
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(target - nums[i])) {
                return new int[]{hash.get(target - nums[i]), i};
            }
            hash.put(nums[i], i);
        }
        return new int[]{};
    }
}