class Solution {
    int count =0;
    public int findTargetSumWays(int[] nums, int target) {
        int sum =0;
      build(nums, sum,0,target);
      return count;
        
    }
    public void build(int[] nums, int sum,int i,int target) {
      if (i == nums.length) {
        if (sum == target) {
            count++;
        }
        return;
    }
      build(nums,sum+nums[i],i+1,target);
      build(nums,sum-nums[i],i+1,target);
        
    }
}
