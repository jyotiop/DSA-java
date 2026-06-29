// LeetCode 15 - 3Sum
// Link: https://leetcode.com/problems/3sum/
// Approach: Sort + Two Pointer
// Time: O(n²) | Space: O(1)

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Fix 'a' in loop, find 'b' and 'c' using two pointers
        // n-2 because we need at least two elements (left, right) after i
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // If smallest element is positive, no triplet possible
            if (nums[i] > 0) break;

            int left = i + 1;               // 'b' pointer
            int right = nums.length - 1;    // 'c' pointer

            // Step 3: Calculate sum using two pointers
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Triplet found
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates from left side
                    while (left < right && nums[left] == nums[left + 1]) left++;

                    // Skip duplicates from right side
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Move both pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
