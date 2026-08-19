class Solution {
    public int numDecodings(String s) {
        int n= s.length();
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]= (s.charAt(0) !='0')? 1:0;
        for(int i =2;i<=n;i++){
            int n2= s.charAt(i-1)-'0';
            if(n2>=1 && n2<=9){
                dp[i]=dp[i-1];
            }
            int n1= s.charAt(i-2)-'0';
            if(n1==1 ||(n1==2 && n2>=0 && n2<=6)){
                dp[i]+=dp[i-2];
            }

        }
        return dp[n];
        
    }
}
