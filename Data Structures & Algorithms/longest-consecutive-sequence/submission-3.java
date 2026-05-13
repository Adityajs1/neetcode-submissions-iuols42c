class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int count = 1;

            while(hai(nums, current+1)){
                current++;
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public boolean hai(int[] nums,int target){
        for(int num : nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }
}