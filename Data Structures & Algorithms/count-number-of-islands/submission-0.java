class Solution {
    public int numIslands(char[][] grid) {
        int n =grid.length;
        int m = grid[0].length;
        int count =0;
        boolean[][] visited = new boolean[n][m];
        for(int i =0;i< n ;i++){
            for(int j=0;j<m;j++){
                if (grid[i][j] == '1' && !visited[i][j]) {
                dfs(i, j, n, m, grid, visited);
                count++; // count only when a new island DFS starts
            }
        }
        }

        return count;
        
    }

    public void dfs(int i, int j, int n, int m,char[][] grid, boolean[][] visited) {
        if(i<0 || i>=n || j<0 ||j>=m || visited[i][j]== true || grid[i][j]=='0')
            return;
            visited [i][j] = true;

            dfs(i+1,j,n,m,grid,visited);
            dfs(i-1,j,n,m,grid,visited);
            dfs(i,j+1,n,m,grid,visited);
            dfs(i,j-1,n,m,grid,visited);
        
    }
}
