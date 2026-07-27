// LeetCode 5 - Longest Palindromic Substring
// Link: https://leetcode.com/problems/longest-palindromic-substring/
// Approach: Expand around center (check odd and even length palindromes)
// Time: O(n^2) | Space: O(1)

class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";

        // track the final indices
        int start = 0 , end = 0;

        for(int i = 0; i< s.length(); i++) {
            // case 1: calculate the odd length palindrome (center = single char at i)
            int len1 = expandFromCenter(s, i, i);

            // case 2: calculate the even length palindrome (center = between i and  i + 1)
            int len2 = expandFromCenter(s , i, i + 1);
            
            // calculate the maximum length
            int len = Math.max(len1, len2); 

            // if the current than is biggest than before len then update

            if(len > end - start + 1) {
                // calculate the end and start length

                start = i - (len - 1)/ 2;
                end  = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }


    // helper function: given left and right pointer, expand outward
    // while characters match, and return length of palindrome found

    private int expandFromCenter(String s , int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // actual palindrome length = right - left - 1
        return right - left - 1;
    }
}
