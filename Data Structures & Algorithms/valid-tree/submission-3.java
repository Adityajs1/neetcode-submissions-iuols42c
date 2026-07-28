class Solution {
    public boolean validTree(int n, int[][] edges) {
        // A tree with n nodes must have exactly n-1 edges
        if (edges.length != n - 1) return false;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        // Build adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return !isCycle(n, adj);
    }

    private boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];

        // Since a tree should have only one component,
        // if we find another unvisited node later, it's disconnected.
        if (dfs(0, -1, vis, adj)) return true;

        // Check connectivity
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) return true;
        }

        return false;
    }

    private boolean dfs(int node, int parent, int[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                if (dfs(it, node, vis, adj)) return true;
            } else if (it != parent) {
                return true;
            }
        }
        return false;
    }
}