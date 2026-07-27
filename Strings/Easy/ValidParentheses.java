// LeetCode 20 - Valid Parentheses
// Link: https://leetcode.com/problems/valid-parentheses/
// Approach: Stack (push opening brackets, match with closing brackets)
// Time: O(n) | Space: O(n)

import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        

        for(char c: s.toCharArray()) {
            // check if the array is opening bracket then push

            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // if found the closing bracker but is Empty
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // check if we found the matching pair or not
                if(c == ')' && top != '(') return false;
                if(c == '}' && top != '{') return false;
                if(c == ']' && top != '[') return false;

            }
        }
        // if stack is empty then matching pairing sucessful
        return stack.isEmpty();   
    }
}
