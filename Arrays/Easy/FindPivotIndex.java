// LeetCode 724 - Find Pivot Index
// Link: https://leetcode.com/problems/find-pivot-index/
// Approach: Prefix sum (compare left sum vs right sum at each index)
// Time: O(n) | Space: O(1)
class Solution {
    public int pivotIndex(int[] nums) {
        // calculate the total sum
        int totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }

        // calculate the left sum
        int leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            // calculate the right sum
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;   
    }
}
