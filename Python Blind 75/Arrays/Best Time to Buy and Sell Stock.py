class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # Time O(n), Space O(1)
        maxProf = 0
        minBuy = prices[0]

        for num in prices:
            maxProf = max(maxProf, num - minBuy)
            minBuy = min(minBuy, num)
        
        return maxProf