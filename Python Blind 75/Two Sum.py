class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Time: O(n), Space: O(n) 
        hashMap = {} # val, index

        for i, val in enumerate(nums): # enumerate allows looping through the index and value of each element
            diff = target - val
            if diff in hashMap:
                return [hashMap[diff], i]
            hashMap[val] = i