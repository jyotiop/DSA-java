// LeetCode 1480 - Running Sum of 1d Array
// Link: https://leetcode.com/problems/running-sum-of-1d-array/
// Approach: Prefix sum in place (add previous element to current)
// Time: O(n) | Space: O(1)
class RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
