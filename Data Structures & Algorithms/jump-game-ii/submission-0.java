class Solution {
    public int jump(int[] nums) {
        int maxEnd =0;
        int currEnd =0;
        int jumps =0;
        for(int i =0;i<nums.length -1;i++){
            maxEnd = Math.max(maxEnd, nums[i]+i);
            if(currEnd == i ){
                jumps++;
                currEnd =maxEnd;
            }
        }
        return jumps;
    }
}
