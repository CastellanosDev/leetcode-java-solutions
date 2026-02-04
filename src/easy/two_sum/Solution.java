package easy.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Given an array of integers and a target, returns the indices
     * of the two numbers that add up to the target.
     * <p>
     * Approach: use a HashMap to store each number and its index as we iterate.
     * For each number, we check if the complement (target - current number) already exists in the map.
     * If it does, we found our pair. If not, we store the current number and move on.
     * <p>
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
}