class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxLen =0;
        HashSet<Character> hset = new HashSet();
        for(int right =0;right< s.length();right++){
            while(hset.contains(s.charAt(right))){
                
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
        
    }
}
