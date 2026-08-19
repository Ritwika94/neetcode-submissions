class Solution {
    public int islandPerimeter(int[][] grid) {
        int n= grid.length;
        int m =grid[0].length;
        int visited[][] =new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return dfs(grid,visited,i,j);
                }
            }
        } 
        return 0;
        
    }
    public int dfs(int[][] grid,int[][] visited,int i,int j){
        if(i>=grid.length || j>=grid[0].length || i<0 ||j<0 
        || grid[i][j]==0){
            return 1;
        }
        if(visited[i][j]==1){
            return 0;
        }
        visited[i][j]=1;
        return dfs(grid,visited,i+1,j) +dfs(grid,visited,i-1,j)
        +dfs(grid,visited,i,j+1)+ dfs(grid,visited,i,j-1);
    }
}