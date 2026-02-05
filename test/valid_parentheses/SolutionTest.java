package valid_parentheses;

import easy.valid_parentheses.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testValidParentheses() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void testInvalidMismatchedBrackets() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void testInvalidWrongOrder() {
        assertFalse(solution.isValid("([)]"));
    }

    @Test
    void testEmptyString() {
        assertTrue(solution.isValid(""));
    }
}