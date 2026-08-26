class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax =0;
        int max=Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            currentMax+=nums[i];
            max= Math.max(max,currentMax);
            if(currentMax<0){
                currentMax =0;
            }
        }

        return max;
        
    }
}
