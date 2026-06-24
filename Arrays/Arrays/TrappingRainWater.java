// LeetCode 42 - Trapping Rain Water
// Link: https://leetcode.com/problems/trapping-rain-water/
// Approach: Left and Right Boundary Arrays
// Time: O(n) | Space: O(n)

class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;

        // Calculate left boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate total trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Water level = min(left boundary, right boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped water at i = water level - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
