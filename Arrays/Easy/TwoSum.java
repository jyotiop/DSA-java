// LeetCode 1 - Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Approach: HashMap (store complement)
// Time: O(n) | Space: O(n)

import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int currNum = nums[i];
            int complement = target - currNum;
            if(map.containsKey(complement)){ // if complement is in the map then the target is found.
                return new int[] {
                    map.get(complement), i
                };
            }
            // so currnum or uska index map me daal de
            map.put(currNum, i);
        }
        return new int[]{};
        
    }
}
