// LeetCode 217 - Contains Duplicate
// Link: https://leetcode.com/problems/contains-duplicate/
// Approach: HashSet (track seen elements)
// Time: O(n) | Space: O(n)

import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Agar element pehle se set mein hai → duplicate!
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
