class Solution {

    List<List<Integer>> res =new ArrayList();
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m =heights.length;
        int n =heights[0].length;

        boolean[][]pacific =new boolean[m][n];
        boolean[][]atlantic =new boolean[m][n];

        for(int i =0;i<n;i++)dfs(0,i,m,n,pacific, heights);
        for(int i =0;i<m;i++)dfs(i,0,m,n,pacific, heights);

        for(int i =0;i<n;i++)dfs(m-1,i,m,n, atlantic, heights);
        for(int i =0;i<m;i++)dfs(i,n-1,m,n, atlantic, heights);

        for (int i =0;i<m;i++){
             for (int j =0;j<n;j++){
                if(pacific[i][j]  && atlantic[i][j]){
                    res.add(Arrays.asList(i, j));
                }
             }

        }

        return res;
    }

    void dfs(int i,int j,int m, int n,boolean[][]visited, int[][] heights){
        if(i< 0 ||i>=m ||j<0 ||j>=n || visited[i][j])
            return;
        visited[i][j]=true;

         int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
         for (int [] dir :directions){
            int ni=i+dir[0];
            int nj =j+dir[1];
            if (ni >= 0 && ni < m && nj >= 0 && nj < n &&
                !visited[ni][nj] &&
                heights[ni][nj] >= heights[i][j]) {  // can flow from neighbor to current
                dfs( ni, nj,m,n,visited,heights);
            }
         }

    }
}
