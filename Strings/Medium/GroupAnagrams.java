// LeetCode 49 - Group Anagrams
// Link: https://leetcode.com/problems/group-anagrams/
// Approach: HashMap with sorted string as key to group anagrams together
// Time: O(n * k log k) | Space: O(n * k)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map: sorted string -> list of original strings in that group
        Map<String, List<String>> map = new HashMap<>();


        for(String str : strs) {
             // convert string to char array and sort it
             char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String SortedStr = new String(chars);

            // if key doesn't exist yet, create a new empty list
            map.putIfAbsent(SortedStr , new ArrayList<>());

            // add the original string to its group
            map.get(SortedStr).add(str);
        }
         // convert all map values (groups) into a list and return
        return new ArrayList<>(map.values());    
    }
}
