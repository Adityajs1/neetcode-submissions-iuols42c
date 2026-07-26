class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
        
    }
    private void bfs(char[][] grid, int i , int j){
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
         int[][] directions = {
            {-1, 0},   
            {1, 0},    
            {0, -1},
            {0, 1}     
        };
        queue.add(new int[]{i,j});
        grid[i][j] = '0';

         while (!queue.isEmpty()) {

            int[] current = queue.remove();

            int r = current[0];// to get the idea where i am standing
            int c = current[1];

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nr >= row || nc < 0 || nc >= col) {
                    continue;
                }
                if (grid[nr][nc] == '0') {
                    continue;
                }

                queue.add(new int[]{nr, nc});
                grid[nr][nc] = '0';
            }
        }

    }
}
