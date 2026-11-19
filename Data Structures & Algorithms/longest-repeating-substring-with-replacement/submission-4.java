class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int max=0;
        int maxLen =0;
        int left =0;
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            max=Math.max(max,freq[s.charAt(i)-'A']);
            if((i-left+1)-max> k){
                System.out.println("hi");
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen =Math.max(maxLen, i-left+1);

        }

        return maxLen;
        
    }
}
