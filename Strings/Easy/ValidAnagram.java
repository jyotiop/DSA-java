// LeetCode 242 - Valid Anagram
// Link: https://leetcode.com/problems/valid-anagram/
// Approach: Character frequency count using fixed-size array
// Time: O(n) | Space: O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        // if length is different so doesn't anagram

        if(s.length() != t.length()) {
            return false;
        }

        // for 26 characters
        int[] count = new int[26];
        
        for(int i=0; i< s.length(); i++) {
            count[s.charAt(i) - 'a']++; // s character -> increment
            count[t.charAt(i) - 'a']--; // t character -> decrement
        }
        // if all count is zero so then the both strings of character have same frequency
        for(int c : count) {
            if(c != 0) {
                return false;
            }
        }
        return true;   
    }
}
