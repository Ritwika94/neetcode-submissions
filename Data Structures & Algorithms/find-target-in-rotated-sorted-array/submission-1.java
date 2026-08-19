class Solution {
    public int search(int[] nums, int target) {
        return searchArray(nums, target,0,nums.length-1);
        
    }
    public int searchArray(int[] nums, int target,int left,int right) {
        if(left>right){
            return -1;
        }
        int mid = left+(right-left)/2;
        if(nums[mid]==target)
            return mid;
        if(nums[mid]>=nums[left]){
            if(target>=nums[left] && target<=nums[mid]){
                return searchArray(nums, target,left, mid-1);
            }
            else{
                return searchArray(nums, target,mid+1, right);

            }
        }
        else {
           if(target>=nums[mid] && target<=nums[right]){
                return searchArray(nums, target,mid+1, right);
            }
            else{
                return searchArray(nums, target,left, mid -1);

            } 
        }
        
    }
}
