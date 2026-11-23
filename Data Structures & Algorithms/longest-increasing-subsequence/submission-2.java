class Solution {
    public int lengthOfLIS(int[] nums) {
        int n =nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                if(nums[i]>nums[j] && dp[i]<dp[j]+1){
                    System.out.println(nums[i]+ " "+nums[j]);
                    dp[i]=dp[j]+1;
                    
                }
            }
            System.out.println(dp[i]);
        }
        int max =0;
        for(int i =0;i<n;i++){
            max = Math.max(max,dp[i]);
        }

        return max;
        
    }
}
