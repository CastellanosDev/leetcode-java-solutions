package medium.longest_Palindromic_Substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testExample1_babad() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("babad");
        // Both "bab" and "aba" are valid answers
        assertTrue(result.equals("bab") || result.equals("aba"),
                "Expected 'bab' or 'aba', but got: " + result);
    }

    @Test
    void testExample2_cbbd() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("cbbd");
        assertEquals("bb", result, "Expected 'bb' for input 'cbbd'");
    }

    @Test
    void testSingleCharacter() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("a");
        assertEquals("a", result, "Single character should return itself");
    }

    @Test
    void testFullPalindrome() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("racecar");
        assertEquals("racecar", result, "Entire string is a palindrome");
    }

    @Test
    void testEvenLengthPalindrome() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("abba");
        assertEquals("abba", result, "Should find even-length palindrome");
    }

    @Test
    void testNoPalindrome() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("abcd");
        // When no palindrome exists, any single character is valid
        assertEquals(1, result.length(), "Should return a single character");
    }

    @Test
    void testEmptyString() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("");
        assertEquals("", result, "Empty string should return empty");
    }

    @Test
    void testNullString() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome(null);
        assertEquals("", result, "Null should return empty string");
    }
}