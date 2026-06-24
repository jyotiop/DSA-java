class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        // shift all non zeros element to the front
        for(int num : nums) {
            if(num != 0) {
                nums[insertPos++] = num;
            }
        }
        // fill the all non zeros element to the end.
        while(insertPos < nums.length) {
            nums[insertPos++] = 0;

        }  
    }
}
