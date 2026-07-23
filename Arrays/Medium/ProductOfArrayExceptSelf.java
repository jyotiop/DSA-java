// LeetCode 238 - Product of Array Except Self
// Link: https://leetcode.com/problems/product-of-array-except-self/
// Approach: Prefix product (left pass) + suffix product (right pass)
// Time: O(n) | Space: O(1) excluding output array

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];

        // step 1: fill the answer of all the element to the left of i
        answer[0] = 1;
        for(int i=1; i < n; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }
        
        // step 2: multiply the answer of all the element to the right of i
        int rightProduct = 1;
        for(int i= n-1; i>=0; i--) {
            answer[i] = answer[i]  * rightProduct;
            rightProduct *=  nums[i];
        }
        return answer;
    }
}
