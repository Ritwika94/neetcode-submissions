class Solution {
    public int jump(int[] nums) {
        int maxEnd = 0;
        int currentEnd =0;
        int i =0;
        int jumps=0;
        while(i<nums.length-1){
              maxEnd = Math.max(maxEnd,nums[i]+i);
             System.out.println(maxEnd);
            if(i==currentEnd){
                jumps++;
                 System.out.println(i +" "+jumps);
                currentEnd = maxEnd;
                if (currentEnd >= nums.length - 1) {
                    return jumps;
                }
            }
            i++;
        }

        return jumps;
        
    }
}
