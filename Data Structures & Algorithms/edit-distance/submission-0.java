class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int T[][]=new int[n+1][m+1];
        for(int i =0;i<=n;i++){
          for(int j =0;j<=m;j++) {
            if(i == 0)
             T[i][j]=j;
            else if(j == 0)
             T[i][j]=i;
            else if(word1.charAt(i-1) == word2.charAt(j-1))
             T[i][j]=T[i-1][j-1];
             else
             T[i][j]= 1+ Math.min(T[i-1][j],Math.min(T[i][j-1],T[i-1][j-1]));
          } 
        }

        return T[n][m];
        
    }
}
