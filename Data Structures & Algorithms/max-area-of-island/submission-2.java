class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length; 
        boolean visited[][]=new boolean[n][m];
        int maxArea = 0;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]){
                    int area =dfs(grid,i,j,visited);
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
        
    }
    private int dfs(int[][] grid, int i,int j, boolean[][]visited){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j]||            grid[i][j]==0){
                return 0;
        }
        visited[i][j]=true;
        int area = 1;

        area += dfs(grid,i+1,j,visited);
        area += dfs(grid,i-1,j,visited);
        area += dfs(grid,i,j+1,visited);
        area += dfs(grid,i,j-1,visited);
        return area;
    }
}
