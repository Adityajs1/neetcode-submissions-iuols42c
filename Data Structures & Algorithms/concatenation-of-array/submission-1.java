class Solution {
    public int[] getConcatenation(int[] nums) {
        int m = nums.length;
        int[] res = new int[2*nums.length];
        for(int i = 0; i < m; i++){
            res[i]  = nums[i];
        }
        for(int j = 0; j < m; j++){
            res[m+j] = nums[j];
        }
        return res;
    }
}