class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = 1;
        }

        int left = 1;
        int right = 1;
        for (int i = 0; i < n; i++) {
            res[i] = res[i] * left;
            res[n - 1 - i] = res[n - 1 - i] * right; // right wala product
            left = left * nums[i];
            right = right * nums[n - 1 - i];
        }

        return res;
    }
}