class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int dist = x * x + y * y;

            pq.offer(new int[]{dist, x, y});
            if (pq.size() > k) {
                pq.poll(); 
            }
        }
        int[][] ans = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            ans[i][0] = curr[1];
            ans[i][1] = curr[2];
            i++;
        }

        return ans;
    }
}