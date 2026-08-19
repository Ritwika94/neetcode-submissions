class Solution {
    public int numDecodings(String s) {
        int dp[]=new int [s.length()+1];
        dp[0]=1;
         dp[1] = (s.charAt(0) != '0') ? 1 : 0;
        for(int i = 2;i<=s.length();i++){
            int n =s.charAt(i-1)-'0';
            if(n >= 1 && n <= 9){
                dp[i]+=dp[i-1];
            }
            int n1 = s.charAt(i - 2) - '0';   
            if((n1 == 1) || (n1 == 2 && n <= 6)){
                dp[i]+=dp[i-2];
            }
        }

        return dp[s.length()];
        
    }
}
