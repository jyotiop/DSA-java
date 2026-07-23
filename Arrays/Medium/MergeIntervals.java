// LeetCode 56 - Merge Intervals
// Link: https://leetcode.com/problems/merge-intervals/
// Approach: Sort by start time, then merge overlapping intervals
// Time: O(n log n) | Space: O(n)
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // step 1: Sort the array by start intervals
        Arrays.sort(intervals, (a, b) -> a[0]- b[0]);

        List<int[]> result = new ArrayList<>();

        for(int[] current : intervals) {
            // If result is empty OR current does not overlap with last merged interval
            if(result.isEmpty() || result.get(result.size() - 1)[1] < current[0]) {
                result.add(current);
            } else {
                // Overlap: merge by updating the end of the last interval
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1] , current[1]);            
            }
        }
        return result.toArray(new int[result.size()][]);   
    }
}
