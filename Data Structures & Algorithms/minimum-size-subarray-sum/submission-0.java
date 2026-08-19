class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int n =nums.length;
        int i =0;
        int left =0;
        int minLen =Integer.MAX_VALUE;
        while(i<n){
            sum+=nums[i];
            while (sum >= target) {
                minLen = Math.min(minLen, i - left + 1);
                sum -= nums[left];
                left++;
            }
            i++;
             
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
        
    }
}