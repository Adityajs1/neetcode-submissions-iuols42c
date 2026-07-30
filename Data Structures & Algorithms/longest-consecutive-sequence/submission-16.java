class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int max = 1;
        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int count = 1;
                while(set.contains(curr + 1)){
                    curr++;
                    count++;
                } 
                 max = Math.max(count, max);               
            }
        }
        return max;
    }
}
// Approach :
// create a hashset , then traverse the array and add all the unique array elements in the hashset, 
// initialise the max consecutive count varibale with 1, then traverse the set, and if the set does not contain num-1
// then that means there is no smaller value than that, so give that small number a name currNum, and initialsie a variable count
// by 1, when check while set contains cuurNuM + 1 , KEEP INCREMENTING THE COUNT, THEN PUTSIDE OF TE WHILE LOOP, MAX , CUUR ->MAX
// RETURN MAX