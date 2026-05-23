class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int count = 1;
            while(ls(nums, curr+1)){
                curr++;
                count++;
            }
              max = Math.max(max, count);
        }
        return max;
    }
    public boolean ls(int[] nums, int target){
        for(int num : nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }
}
