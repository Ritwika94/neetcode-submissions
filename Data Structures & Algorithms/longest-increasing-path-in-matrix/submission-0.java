class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int dp [][]=new int[n][m];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        int LIP =0;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){

                LIP =Math.max(LIP,dfs(i,j,n,m,-1,dp,matrix));

            }

        }

        return LIP;
        
    }

    public int dfs(int r, int c,int n,int m, int prev, int[][]dp,int[][] matrix){
        
        if(r< 0 || r>=n || c<0 || c>=m || matrix[r][c]<=prev)
            return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        int res =1;
        res =Math.max(res,1+dfs(r+1,c,n,m,matrix[r][c], dp, matrix));
        res =Math.max(res,1+dfs(r-1,c,n,m,matrix[r][c], dp, matrix));
        res =Math.max(res,1+dfs(r,c+1,n,m,matrix[r][c], dp, matrix));
        res =Math.max(res,1+dfs(r,c-1,n,m,matrix[r][c], dp, matrix));
        dp[r][c]=res;
        return res;
    }



}
