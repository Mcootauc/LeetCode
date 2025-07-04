class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # Time: O(n), Space O(1)
        if len(s) != len(t): return False # If the lengths are not the same, they can't be anagrams

        count = [0] * 26 # creates an array of twenty six 0's which will count the number of chars
        for i in range(len(s)):
            count[ord(s[i]) - ord('a')] += 1
            count[ord(t[i]) - ord('a')] -= 1
        return count == [0] * 26