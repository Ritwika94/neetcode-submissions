class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){

            return "";
        }
        Arrays.sort(strs);
        String s1 =strs[0];
        String s2 = strs[strs.length-1];
        int minLen = Math.min(s1.length(), s2.length());

        for(int i=0;i<minLen;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.substring(0,i);
            }
        }
         return s1.substring(0, minLen);
        
    }
}