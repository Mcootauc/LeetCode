class Solution(object):
    def fizzBuzz(self, n):
        # Time: O(n), Space: O(n) n items in the ans list
        """
        :type n: int
        :rtype: List[str]
        """
        ans = []
        for i in range(1, n + 1):
            ans_str = ""
            if i % 3 == 0:
                ans_str += "Fizz"
            if i % 5 == 0:
                ans_str += "Buzz"
            if not ans_str:
                ans_str = str(i)
            ans.append(ans_str)
        return ans