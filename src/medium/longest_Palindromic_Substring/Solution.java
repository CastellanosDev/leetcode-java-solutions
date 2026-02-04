package medium.longest_Palindromic_Substring;

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