class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int arr[]=new int[26];
        int maxLen =Integer.MIN_VALUE;
        int res =0;
        char arr1[]=s.toCharArray();
        for(int i =0;i<arr1.length;i++){
            arr[arr1[i]-'A']++;
             maxLen=Math.max(maxLen,arr[arr1[i]-'A']);
            if((i-left+1)-maxLen >k){
                arr[arr1[left]-'A']--;
                left++;
            }
            res=Math.max(res,i-left+1);
        }

        return res;
        
    }
}
