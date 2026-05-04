class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        for(int num : count.values()){
            if(num> 1){
                return true;
            }
        }
        return false;
    }
}