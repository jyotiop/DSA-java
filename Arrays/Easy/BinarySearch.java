// LeetCode 704 - Binary Search
// Link: https://leetcode.com/problems/binary-search/
// Approach: Classic binary search on sorted array
// Time: O(log n) | Space: O(1)

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left <= right) {
            //  calculate the mid value
            int mid = left + (right - left)  / 2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }
        // if the index doesn't exist so return -1
        return -1;  
    }
}
