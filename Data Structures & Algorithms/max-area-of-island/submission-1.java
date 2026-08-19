class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n =grid.length;
        int m = grid[0].length;
       
        int max = 0;
        boolean[][] visited = new boolean[n][m];
        for(int i =0;i< n ;i++){
            for(int j=0;j<m;j++){
                if (grid[i][j] == 1 && !visited[i][j]) {
                
                int count = dfs(i, j, n, m, grid, visited);
                max= Math.max(count,max);
                }
                
            }
        }

        return max;
        
        
    }
    public int dfs(int i, int j, int n, int m, int[][] grid, boolean[][] visited) {
    if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || grid[i][j] == 0)
        return 0;

    visited[i][j] = true;

    int area = 1;
    area += dfs(i + 1, j, n, m, grid, visited);
    area += dfs(i - 1, j, n, m, grid, visited);
    area += dfs(i, j + 1, n, m, grid, visited);
    area += dfs(i, j - 1, n, m, grid, visited);

    return area;
}
}
