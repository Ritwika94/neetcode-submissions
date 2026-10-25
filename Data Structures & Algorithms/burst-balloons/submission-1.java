class Solution {
    public int maxCoins(int[] nums) {
        
        int n=nums.length;
        int arr[]=new int[n+2];
        int dp[][]=new int[n+2][n+2];
        for(int i=0;i<n;i++){
            arr[i+1]=nums[i];
        }
        arr[0]=1;
        arr[n+1]=1;
        int m=n+2;
        for(int l=2;l<m;l++){
            for(int i=0;i+l<m;i++){
                int j=i+l;
                for(int k =i+1;k<j;k++){
                     int coins = arr[i] * arr[k] * arr[j];
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + coins + dp[k][j]);
                }
            }
        }

        return dp[0][m-1];
        
    }
}
