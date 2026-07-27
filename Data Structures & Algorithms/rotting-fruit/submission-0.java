class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int minutes = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                }
                else if(grid[i][j] == 1){
                    fresh++;

                }
            }
        }
        if(fresh == 0)return 0;

          int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };
    while(!q.isEmpty()){
        int size = q.size();
        boolean rot = false;
        
        for(int i = 0; i < size; i++){
            int[] curr = q.remove();
            int r = curr[0];
            int c = curr[1];

            for(int[] dir : directions){
                int nr = r + dir[0];
                int nc = c + dir[1];

               if (nr >= 0 && nr < row &&
                        nc >= 0 && nc < col &&
                        grid[nr][nc] == 1){
                    grid[nr][nc] = 2;
                    fresh--;
                    q.add(new int[]{nr, nc});
                    rot= true;
                } 
            }
        }
        if(rot)minutes++;
    }
        return fresh == 0  ? minutes : -1;
    }
   
}
