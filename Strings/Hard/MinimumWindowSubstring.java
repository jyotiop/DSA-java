// LeetCode 76 - Minimum Window Substring
// Link: https://leetcode.com/problems/minimum-window-substring/
// Approach: Sliding window with character frequency array
// Time: O(m+n) | Space: O(1)
class Solution {
    public String minWindow(String s, String t) {
        // step 1: Store required count of each character from t
        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int required = t.length();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // If this character is still needed, reduce the required counter
            if (need[c] > 0) {
                required--;
            }

            // update count (can go negative for extra/unused characters)
            need[c]--;
            // Window is valid when required == 0, try shrinking from left
            while (required == 0) {
                // Update the answer if current window is smaller than best found so far
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;

                // If this character becomes needed again, window is no longer valid
                if (need[leftChar] > 0) {
                    required++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
