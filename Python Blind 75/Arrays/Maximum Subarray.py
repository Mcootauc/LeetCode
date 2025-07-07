class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # Time: O(n), Space: O(1)
        currMax, totalMax = 0, nums[0]

        for num in nums:
            if currMax < 0:
                currMax = 0
            currMax += num
            totalMax = max(currMax, totalMax)
        return totalMax