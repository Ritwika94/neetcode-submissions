class Solution {
    public int search(int[] nums, int target) {
        return searchMid(nums,target,0,nums.length-1);
    }
    public int searchMid(int[] nums, int target,int left, int right) {
        int n=nums.length;
        if(left>right) return -1;
        int mid =left+(right-left)/2;
            if(nums[mid]==target)
            return mid;
            if(nums[mid]>=nums[left]){
                if(nums[left]<=target && target<=nums[mid]){
                    return searchMid(nums,target,left,mid-1);
                }
                else
                return searchMid(nums,target,mid+1,right);
            }
            else{
                if(nums[mid]<=target && target<=nums[right]){
                    return searchMid(nums,target,mid+1,right);
                }
                else{
                   return searchMid(nums,target,left,mid-1); 
                }

            }

        
        
    }
    
}
