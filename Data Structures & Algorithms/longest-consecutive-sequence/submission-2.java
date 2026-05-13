class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int current = 1;
        int longest = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                continue;
            }
            else if(nums[i + 1] - nums[i] == 1) {
                current++;
            }
            else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }
        longest = Math.max(longest, current);
        return longest;
    }
}