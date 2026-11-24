class Solution {
    public boolean isMatch(String s, String p) {
       int n= s.length();
       int m =p.length();
       boolean dp[][] = new boolean[n+1][m+1];
       char text[]= s.toCharArray();
       char pattern[] = p.toCharArray();
       dp[0][0] = true;
       for(int j=1;j<=m;j++){
            if(pattern[j-1]== '*'){
                dp[0][j]=dp[0][j-2];
            }
        }
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(pattern[j-1]=='.' || text[i-1]==pattern[j-1]){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(pattern[j-1]=='*'){
                    dp[i][j]=dp[i][j-2];
                    if((pattern[j-2]=='.') || pattern[j-2] == text[i-1]){
                       dp[i][j]=dp[i][j] || dp[i-1][j] ;
                    } 
                }
                else{
                    dp[i][j]=false;
                }
            }
        }

        return dp[n][m];
       
    }
}


