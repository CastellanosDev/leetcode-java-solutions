package easy.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Given an array of integers and a target, returns the indices
     * of the two numbers that add up to the target.
     *
     * Approach: use a HashMap to store each number and its index as we iterate.
     * For each number, we check if the complement (target - current number) already exists in the map.
     * If it does, we found our pair. If not, we store the current number and move on.
     *
     * Time complexity:  O(n) — single pass through the array
     * Space complexity: O(n) — in the worst case we store all numbers in the map
     */
    public int[] twoSum(int[] nums, int target) {
        // Map to store: number -> its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // The number we need to find to complete the pair
            int complement = target - nums[i];

            // If the complement is already in the map, we found our answer
            if (map.containsKey(complement)) {
                // Return the index of the complement and the current index
                return new int[]{map.get(complement), i};
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        // No valid pair found (shouldn't happen if input is guaranteed valid)
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test 1: basic case → expected [0, 1]
        int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Test 1: " + Arrays.toString(result1));

        // Test 2: target in the middle → expected [1, 2]
        int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Test 2: " + Arrays.toString(result2));

        // Test 3: negative numbers → expected [1, 2]
        int[] result3 = solution.twoSum(new int[]{3, -2, 1}, -1);
        System.out.println("Test 3: " + Arrays.toString(result3));
    }
}