class Solution:
    def maxArea(self, heights: List[int]) -> int:
        # Time: O(n), Space: O(1)
        leftPoint = 0
        rightPoint = len(heights) - 1
        maxWater = 0

        while leftPoint < rightPoint:
            width = rightPoint - leftPoint
            maxWater = max(maxWater, min(heights[leftPoint], heights[rightPoint]) * width)
            if heights[leftPoint] < heights[rightPoint]:
                leftPoint += 1
            else:
                rightPoint -= 1
        
        return maxWater