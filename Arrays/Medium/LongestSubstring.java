// LeetCode 3 - Longest Substring Without Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Approach: Sliding Window + HashSet
// Time: O(n) | Space: O(n)

import java.util.HashSet;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int L = 0, maxLen = 0;

        for (int R = 0; R < s.length(); R++) {
            // If duplicate found, shrink window from left
            while (set.contains(s.charAt(R))) {
                set.remove(s.charAt(L));
                L++;
            }
            set.add(s.charAt(R));
            maxLen = Math.max(maxLen, R - L + 1);
        }
        return maxLen;
    }
}
