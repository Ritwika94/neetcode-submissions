class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean dp[]=new boolean[n+1];
        int i =0;
       
        Arrays.fill(dp,false);
        dp[0]=true;

        while(i<n){
            if(!dp[i]){
                i++;
                continue;
            }
            else{
                for(String word : wordDict){
                    int len =word.length();
                    int end = i+len;
                    if(end >n){
                        continue;
                    }
                    
                    String w= s.substring(i,end);
                    if(w.equals(word)){
                        dp[end]=true;
                    }
                    
                }
            }
            i++;
            
            
        }

        return dp[n];
    }
}
