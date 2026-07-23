// LeetCode 53 - Maximum Subarray
// Link: https://leetcode.com/problems/maximum-subarray/
// Approach: Kadane's Algorithm (extend or restart current subarray)
// Time: O(n) | Space: O(1)
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend previous subarray or start fresh from current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
