class Solution {
    public boolean isAnagram(String s, String t) {
        // Time: O(n) Space: O(1)
        if (s.length() != t.length()) return false; // anagrams are same lengths

        int[] count = new int[26]; // 26 letters in alphabet
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // increments the count of the letter at index
            count[t.charAt(i) - 'a']--; // decrements the count of the letter at index
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) return false; // checks if they had equal amounts of letters
        }
        return true;
    }
}