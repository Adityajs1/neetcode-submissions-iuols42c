class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }
    private void findSubsets(int index, int[] nums,List<Integer> ds, List<List<Integer>> ans ){
        if(index == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        findSubsets(index+1, nums, ds, ans);
        ds.remove(ds.size()-1);
        findSubsets(index+1, nums, ds, ans);

    }
}
