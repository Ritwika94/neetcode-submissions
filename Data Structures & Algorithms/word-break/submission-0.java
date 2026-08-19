class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[]=new boolean[s.length()+1];
        Arrays.fill(dp,false);
        dp[0]=true;
       
        for(int i =0;i<s.length();i++){
            if(!dp[i]){
                continue;
            }
            for(String word :wordDict){
                int len=word.length();
                int end = i +len;
                if(end > s.length()){
                    continue;
                }
                if(dp[end])
                    continue;
                String str = s.substring(i, end);
                System.out.println(str);
                if(str.equals(word)){
                    dp[end]=true;
                }
            }
           
        }

        return dp[s.length()];
    }
}
