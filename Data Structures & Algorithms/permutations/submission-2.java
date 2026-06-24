class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         recurPermute(nums,0, ans);
         return ans;
    }
    private void swap(int i, int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void recurPermute(int[] nums, int index, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

       for(int i = index; i <nums.length; i++){
         swap(i, index, nums);
        recurPermute(nums, index+1, ans);
        swap(i, index, nums);
       }
    }
}
