class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int left =0;
        int maxLen = 1;
        HashSet<Character> hset = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            while(hset.contains(c)){
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(c);
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
        
    }
}
