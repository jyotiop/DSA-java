// LeetCode 153 - Find Minimum in Rotated Sorted Array
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Approach: Modified binary search — compare nums[mid] with nums[right] to decide which half to discard
// Time: O(log n) | Space: O(1)

class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        // step 1:  // Keep narrowing the search space until left meets right
        while(left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than rightmost element,
            // the minimum must be somewhere to the right of mid
            if(nums[mid] > nums[right]) {
                left = mid + 1;
            }
             // Otherwise, the right half (mid to right) is sorted,
            // so minimum is at mid or to its left
            else {
                right = mid;
            }
        }
        // When left == right, that index holds the minimum
        return nums[left];
        
    }
}
