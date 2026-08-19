class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
                if (sum % 2 != 0) return false;

        int half =sum/2;
        return canDivide(nums,0,0,half);
        
    }
    public boolean canDivide(int[] nums,int sum,int start,int half) {
        if(sum ==half){
            return true;
        }
        if (sum > half || start >= nums.length) return false;

        
if (canDivide(nums, sum + nums[start], start + 1, half)) {
        return true;
    }

    // NOT PICK
    return canDivide(nums, sum, start + 1, half);
    }
}
