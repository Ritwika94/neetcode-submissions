class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0)
            return 0;
        Arrays.sort(nums);
        int max =1;
        int i=0;
        int r =0;
        int l =0;
        while(i<nums.length-1){
            if(nums[i+1]==nums[i]){
                i++;
                continue;
            }
            System.out.println(nums[i]+" "+nums[i+1]);
            if(nums[i+1]==nums[i]+1){
                r++;
            }
            else{
                System.out.println("len:"+r +" "+l);
                max= Math.max(r-l+1,max);
                System.out.println("max:"+ max);
                l=i+1;
                r=i+1;
            }
            i++;
        }

         max= Math.max(r-l+1,max);

        return max;
        
    }
}
