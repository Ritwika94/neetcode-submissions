class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        HashSet<Character> hset = new  HashSet<Character>();
        int left =0;
        int right =0;
        int max = 0;
        while(right<n){
            char c = s.charAt(right);
        while(hset.contains(c)){
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(c);
            max=Math.max(max, right -left+1);
            right++;
        }
        return max;
        
    }
}
