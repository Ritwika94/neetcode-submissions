class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        
        int dp[][]=new int[n][amount+1];
          for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = (j == 0) ? 0 : amount+1;
            }
        }

        for (int j = 1; j <= amount; j++) {
            if (j % coins[0] == 0) {
                dp[0][j] = j / coins[0];
            }
        }
        for(int i =1;i<n;i++){
            for(int j =1;j<=amount;j++){
                
                if(j<coins[i]){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coins[i]]+1);
                }
            }
        }
        return dp[n - 1][amount] >= amount + 1 ? -1 : dp[n - 1][amount];
        
    }
}
