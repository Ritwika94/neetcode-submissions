class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int arr []=new int[26];
        int max = 0;
        int res =0;
        for(int i =0;i<s.length();i++){
            arr[s.charAt(i) -'A']++;
             max =Math.max(max,arr[s.charAt(i) -'A']);
            if((i-left+1)-max>k){
                arr[s.charAt(left)-'A']--;
                left++;

            }
            res =Math.max(res, i -left +1);
        }

        return res;
        
    }
}
