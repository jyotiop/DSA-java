// LeetCode 2958 - Length of Longest Subarray With at Most K Frequency
// Link: https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/
// Approach: Sliding window with frequency HashMap
// Time: O(n) | Space: O(n)

import java.util.*;
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer , Integer> freq = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < nums.length; right++) {
            // Increment the frequency count of nums[right] in the map by 1
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            // if the window is bad then (count > k), shrink
            while (freq.get(nums[right]) > k) {
                freq.put(nums[left], freq.get(nums[left])- 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;   
    }
}
