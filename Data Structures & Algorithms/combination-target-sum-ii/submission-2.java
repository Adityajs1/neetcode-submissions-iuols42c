class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    private void findCombination(int[] arr,int target, int index, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
      
        for(int i = index; i < arr.length; i++){// index defined where the choice start
            if(i > index && arr[i] == arr[i-1])continue;
            if(arr[i] > target)break;

            ds.add(arr[i]);
            findCombination(arr, target-arr[i], i+1, ans, ds);
            ds.remove(ds.size()-1);

        }
    }
}
