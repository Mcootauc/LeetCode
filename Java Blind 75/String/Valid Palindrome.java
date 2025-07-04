class Solution {
    public boolean isPalindrome(String s) {
        // Time O(n) and Space O(1)
        int L = 0, R = s.length() - 1;

        while (L < R) {
            // Passes non alphanumeric chars from left pointer
            while (L < R && !Character.isLetterOrDigit(s.charAt(L))) {
                L++;
            }
            // Passes non alphanumeric chars from right pointer
            while (L < R && !Character.isLetterOrDigit(s.charAt(R))) {
                R--;
            }
            if (Character.toLowerCase(s.charAt(L)) != Character.toLowerCase(s.charAt(R))) {
                return false;
            }
            // increments and decrements the pointers when the characters match
            L++;
            R--;
        }
        return true;
    }
}