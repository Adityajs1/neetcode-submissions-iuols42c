class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0)return 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int max = 1;
        for(int num : set){
        if(!set.contains(num -1)){
            int currNum = num;
            int count = 1;
            while(set.contains(currNum + 1)){
                currNum++;
                count++;
            }
            max = Math.max(max, count);
        }
      }
        return max;
    }
}
