// LeetCode 1004 - Max Consecutive Ones III
// Link: https://leetcode.com/problems/max-consecutive-ones-iii/
// Approach: Sliding window (shrink when zero count exceeds k)
// Time: O(n) | Space: O(1)

class Solution {
    public int longestOnes(int[] nums, int k) {

        // sliding window approach
        int left = 0, zeroCount = 0, maxLen = 0;

        // check the length
        for(int right=0; right < nums.length; right++) {
            if(nums[right] == 0) zeroCount++;

            while(zeroCount > k) {
                if(nums[left] == 0) zeroCount--;
                left++;
            }

            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
        
    }
}
