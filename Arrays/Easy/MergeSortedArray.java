// LeetCode 88 - Merge Sorted Array
// Link: https://leetcode.com/problems/merge-sorted-array/
// Approach: Merge from the back using three pointers
// Time: O(m+n) | Space: O(1)


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // check last valid element in nums1 
        int j = n - 1; // check last  element in nums2 
        int k = m + n - 1; // last position in nums1

        while(j >= 0) {
            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }  
    }
}
