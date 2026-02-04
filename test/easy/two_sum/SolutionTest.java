package easy.two_sum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @Test
    void testExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, target));
    }

    @Test
    void testExample3_Duplicates() {
        int[] nums = {3, 3};
        int target = 6;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    // Edge cases
    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        assertArrayEquals(new int[]{2, 4}, solution.twoSum(nums, target));
    }

    @Test
    void testZeroTarget() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        assertArrayEquals(new int[]{0, 2}, solution.twoSum(nums, target));
    }

    @Test
    void testMinimumArray() {
        int[] nums = {1, 2};
        int target = 3;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    // Quality checks
    @Test
    void testLargeNumbers() {
        int[] nums = {1000000000, 999999999, 1};
        int target = 1999999999;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

}