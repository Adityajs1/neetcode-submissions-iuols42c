class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        //ek arraylist bnate hai
        ArrayList<Integer> op = new ArrayList<>();
        for(int i = 0; i<=n-k; i++){
            int max = nums[i];
            for(int j = i; j < i+k; j++){
                max = Math.max(max, nums[j]);
            }
            op.add(max);
        }
        // yha kaam ban gya hai lekin array return krna padega
        int[] result = new int[op.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = op.get(i);
        }
        return result;
    }
}
