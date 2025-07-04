class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        // Time: O(n), 
        // Because n is the length of the plank
        // iterate through the pos of ants moving left and right once
        // both loops are seperate
        // they do not depend or nest within each other 

        // Space: O(1)
        // Constant amount of additional space regardless of input size

        // two pass
        // checks each position to get the maximum amount of time
        int time = 0;

        // Ex: if the position in the left array starts with 4 then
        // the time it would take to fall is 4 seconds
        for (int pos : left) {
            time = Math.max(time, pos);
        }
        // Ex: if the position in the right array starts with 1 then
        // the time it would take to fall is 
        // n (the length of the board) - 1 seconds
        for (int pos : right) {
            time = Math.max(time, n - pos);
        }

        return time;
    }
}