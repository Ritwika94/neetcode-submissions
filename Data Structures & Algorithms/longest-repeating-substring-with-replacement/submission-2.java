class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[26];
        int left =0;
        char arr1[]=s.toCharArray();
        int maxLen=0;
        int res =0;
        for(int i =0;i< arr1.length;i++){
            arr[arr1[i]-'A']++;
            maxLen= Math.max(maxLen,arr[arr1[i]-'A']);
            if((i-left+1) - maxLen>k){
                arr[arr1[left]-'A']--;
                left++;
            }
            res = Math.max(res, i-left+1);
        }
        return res;

        
    }
}
