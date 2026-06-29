// LeetCode 15 - 3Sum
// Approach: Sort + Two Pointer
// Time: O(n²) | Space: O(1)

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // step 1 : sort the array
       Arrays.sort(nums);

       List<List<Integer>> result = new ArrayList<>();

        // step 2 : 
        // i loop me 'a' ko fix karna;
        // so n-2 because of we want atleast two element (left, right) 
        for (int i = 0; i<nums.length-2; i++) {

            // duplicate skip : if the previous item has the same value then skip it,
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            // if the smallest element is positive so, nothing is found
            if(nums[i] > 0)
            break;

            int left =  i + 1; // calculate the left value  'b' pointer 
            int right = nums.length - 1; // calculate the right value 'c pointer'

            // step 3 : calculate the sum
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];


                if(sum == 0) {
                    // triplet is found.
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // duplicate is remove from left side;
                    while (left < right && nums[left] == nums[left + 1]) left++;

                    // duplicate is remove from right side, 

                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    //  move the both pointers
                    left++;
                    right--;   
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }  

        return result;
        
    }
}
