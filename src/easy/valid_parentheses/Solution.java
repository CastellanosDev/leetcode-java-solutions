package easy.valid_parentheses;

import java.util.Stack;

/**
 * Exercise: Valid Parentheses (LeetCode #20)
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets
 * 2. Open brackets must be closed in the correct order
 * 3. Every close bracket has a corresponding open bracket of the same type
 * <p>
 * Examples:
 * - "()" → true
 * - "()[]{}" → true
 * - "(]" → false
 * - "([])" → true
 * - "([)]" → false
 */

public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        // Iterate through the entire string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the current character is an opening bracket
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            }
            // If it's a closing bracket
            else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {

                // If the stack is empty, return false
                if (stack.isEmpty()) {
                    return false;
                }

                // Get the last element from the stack
                char top = stack.pop();
                // Check if it matches the corresponding opening bracket

                if (currentChar == ')' && top != '(') {
                    return false;
                }
                if (currentChar == ']' && top != '[') {
                    return false;
                }
                if (currentChar == '}' && top != '{') {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}