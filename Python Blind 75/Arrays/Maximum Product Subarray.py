class Solution(object):
    def maxProduct(self, nums):
        # Time: O(n), Space: O(1)
        """
        :type nums: List[int]
        :rtype: int
        """
        currMax, minMax, maxProd = nums[0], nums[0], nums[0]
        for i in range(1, len(nums)):
            tempMax = max(nums[i], max(nums[i] * currMax, nums[i] * minMax))
            minMax = min(nums[i], min(nums[i] * currMax, nums[i] * minMax))
            currMax = tempMax
            maxProd = max(maxProd, currMax)
        return maxProd
        