class Solution {
    public int countComponents(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        // Build adjacency list
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!vis[i]){
                count++;
                dfs(i, vis, adj);
            }
        }

        return count;
    }

    private void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;

        for(int it : adj.get(node)){
            if(!vis[it]){
                dfs(it, vis, adj);
            }
        }
    }
}
