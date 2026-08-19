class Solution {
    public void moveZeroes(int[] nums) {
        int count =0;
        
        int arr1[]=new int[nums.length];
        int i =0;
        int j=0;
        
        while(i<nums.length && j< nums.length){
            if(nums[i]!=0){
                arr1[j]=nums[i];
                j++;
            }
            i++;
        }

  

        for (int k = 0; k < nums.length; k++) {
            nums[k] = arr1[k];
        }

        
    }
}