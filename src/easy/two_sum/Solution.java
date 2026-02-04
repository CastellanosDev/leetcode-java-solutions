package easy.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * LeetCode #1 - Two Sum
     * Difficulty: Easy
     * <p>
     * Problem:
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice. You can return the answer in any order.
     * <p>
     * Examples:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * <p>
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * <p>
     * Constraints:
     * - 2 <= nums.length <= 10⁴
     * - -10⁹ <= nums[i] <= 10⁹
     * - -10⁹ <= target <= 10⁹
     * - Only one valid answer exists
     * <p>
     * Approach:
     * - Use HashMap to store each number and its index as we iterate
     * - For each number, check if complement (target - current) exists in map
     * - If found, return both indices; otherwise, store current number
     * <p>
     * Time Complexity: O(n) where n is the number of elements
     * Space Complexity: O(n) for the HashMap storage
     *
     * @author Nacho
     * @see <a href="https://leetcode.com/problems/two-sum/">LeetCode Problem</a>
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