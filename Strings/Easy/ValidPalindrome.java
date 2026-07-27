// LeetCode 125 - Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/
// Approach: Two pointers (skip non-alphanumeric, compare case-insensitively)
// Time: O(n) | Space: O(1)
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // step 1: move left pointer forward unitl the alphanumeric is found or not
        while( left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // step 2: move right pointer backward unitl the alphanumeric is found or not
             while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare characters case-insensitively
            int leftChar = Character.toLowerCase(s.charAt(left));
            int rightChar = Character.toLowerCase(s.charAt(right));

            if(leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
