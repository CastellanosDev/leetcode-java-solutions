package medium.longest_Palindromic_Substring;

/**
 * LeetCode #5 - Longest Palindromic Substring
 * Difficulty: Medium
 * <p>
 * Problem:
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * Examples:
 * Input: s = "babad"
 * Output: "bab" (Note: "aba" is also a valid answer)
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 * Constraints:
 * - 1 <= s.length <= 1000
 * - s consists of only digits and English letters
 * <p>
 * Approach:
 * - Expand around center technique
 * - For each position, expand outward while characters match
 * - Check both odd-length (single center) and even-length (dual center) palindromes
 * <p>
 * Time Complexity: O(n²) where n is the length of the string
 * Space Complexity: O(1) - only using index variables
 *
 * @author CastellanosDev
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/">LeetCode Problem</a>
 */

class Solution {

    public String longestPalindrome(String s) {
        // Checking there is no null data or just 1 letter
        if (s == null || s.length() < 1) {
            return "";
        }

        // Variables to know where the ebst palindromic starts and ends
        int start = 0;
        int end = 0;

        // Try each position as a potential center
        for (int i = 0; i < s.length(); i++) {

            //Each potencial center may be odd or even
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1); //even

            int len = Math.max(len1, len2);

            //Check if this is larger than the current palindromic
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        //convert substring from start to end (included)
        return s.substring(start, end + 1);
    }

    // This method will be my assistant,
    // and help me to expand to the right and left
    // if both characters are the same
    private int expandAroundCenter(String s, int left, int right) {
        // While I'm not out the string and both characters are the same
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;   //
            right++;  //
        }
        return right - left - 1;
    }

}