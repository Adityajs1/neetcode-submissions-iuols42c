class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurse(0, nums, ans);
        return ans;
        
    }
    private void swap(int[] nums, int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    private void recurse(int index, int[] arr, List<List<Integer>> ans){
        if(index == arr.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = index; i < arr.length; i++){
            swap(arr, i, index);
            recurse(index+1, arr, ans);
            swap(arr, i, index);

        }
    }
}
