class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # Time: O(n), Space: O(1)
        ans = [1] * len(nums)
        prefix = 1
        # prefix
        for i in range(len(nums)):
            ans[i] = prefix
            prefix *= nums[i]
        # postfix
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            ans[i] *= postfix
            postfix *= nums[i]

        return ans
        