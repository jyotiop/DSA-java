// LeetCode 11 - Container With Most Water
// Link: https://leetcode.com/problems/container-with-most-water/
// Approach: Two pointers (move the shorter height inward)
// Time: O(n) | Space: O(1)

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        // step 1: calculate the max water
        while(left < right) {
            // calculate the width
            int width = right - left;
            // calculate the height
            int currHeight = Math.min(height[left], height[right]);
            // calculate the area
            int currArea = width * currHeight;
            // calculate the maxwater
            maxWater = Math.max(maxWater, currArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;    
    }
}
