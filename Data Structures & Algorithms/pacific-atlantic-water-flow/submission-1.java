class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        boolean pacific[][] = new boolean[n][m];
        boolean atlantic[][] = new boolean[n][m];
        for(int i=0;i<m;i++){
            dfs(0,i,n,m,pacific,heights);
        }
        for(int i=0;i<n;i++){
          dfs(i,0,n,m,pacific,heights);
        }
        for(int i=0;i<m;i++){
          dfs(n-1,i,n,m,atlantic,heights);
        }
        for(int i=0;i<n;i++){
          dfs(i,m-1,n,m,atlantic,heights);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer>list =new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }

        return res;
    }
    public void dfs(int i,int j,int r,int c, boolean[][] visited ,int[][] heights) {
        if(i<0 || j<0 || i>=r ||j>=c || visited[i][j]){
            return;
        }
        visited[i][j]=true;

        int[][]directions={{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] dr : directions){
            int ni = i+ dr[0];
            int nj = j+ dr[1];
                if (ni < 0 || nj < 0 || ni >= r || nj >= c) continue;   
            if(heights[ni][nj]>=heights[i][j]){
                dfs(ni,nj,r,c,visited,heights);
            }
        }
    }
}
