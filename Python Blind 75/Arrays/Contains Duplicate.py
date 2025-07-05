class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # Time: O(n), Space: O(n)
        seenNums = set()

        for num in nums:
            if num in seenNums:
                return True
            else:
                seenNums.add(num)
        
        return False
