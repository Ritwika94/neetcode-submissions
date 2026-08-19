class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      

        int currMax =0;
        int currMin=0;
        int globMax=nums[0];
        int globMin=nums[0], total =0;
        for(int n :nums){
            currMin=Math.min(n, currMin+n);
            currMax=Math.max(n, currMax+n);
            globMax=Math.max(globMax, currMax);
            globMin=Math.min(globMin, currMin);
            total+=n;
        }

        return globMax<0? globMax : Math.max(globMax, total -globMin);
    } 

       
}