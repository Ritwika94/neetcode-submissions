class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=(s.charAt(0)!='0' )?1:0;
        for(int i =2;i<=n;i++){
            int val = s.charAt(i-1)-'0';
            if(val>=1 && val<=9){
                dp[i]=dp[i-1];
                System.out.println("first " +dp[i]);
            }
            int val1 =s.charAt(i-2) -'0';
            if(val1==1 ||(val1 ==2 && val>=0 && val<=6)){
                dp[i]+=dp[i-2];
                System.out.println("second " +dp[i]);
            }
        }

        return dp[n];
        
    }
}
