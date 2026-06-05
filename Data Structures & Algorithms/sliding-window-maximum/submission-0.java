class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i <= n-k;i++){
            int max = nums[i];
            for(int j = i; j < i+k; j++){
                max = Math.max(max, nums[j]);
            }
            output.add(max);
        }
        int[] res = new int[output.size()];
        for(int i = 0; i < output.size(); i++){
            res[i] = output.get(i);
        }

        return res;
    }
}
