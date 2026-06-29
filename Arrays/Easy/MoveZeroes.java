// LeetCode 283 - Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/
// Approach: Two Pointer
// Time: O(n) | Space: O(1)

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Shift all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
