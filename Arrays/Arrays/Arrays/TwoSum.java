// LeetCode 1 - Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Approach: HashMap (store complement)
// Time: O(n) | Space: O(n)



import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            int complement = target - currNum;
            
            // Agar complement map mein hai → target mil gaya
            if (map.containsKey(complement)) {
                return new int[] {
                    map.get(complement), i
                };
            }
            // currNum aur uska index map mein daalo
            map.put(currNum, i);
        }
        return new int[]{};
    }
}
