class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Time: O(n) 
        // Because it iterates through the array once

        // Space: O(n)
        // Because the space used by a hash set is linear
        // with the nubmer of elements in nums

        HashSet<Integer> setOfNums = new HashSet<>();
        for (int num : nums) {
            if (setOfNums.contains(num)) return true;
            setOfNums.add(num);
        }
        return false;
    }
}