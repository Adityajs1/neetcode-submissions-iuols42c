class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int element : nums){
            pq.add(element);
            if(pq.size() > k)pq.remove();
        }
        return pq.peek();
    }
}
