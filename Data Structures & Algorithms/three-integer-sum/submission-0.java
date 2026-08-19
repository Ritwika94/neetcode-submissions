class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left =i+1;
            int right =n-1;
            while(left<right){

                if( (nums[left] + nums[i]+nums[right]==0)){
                    ArrayList<Integer> list = new ArrayList();
                    list.add(nums[left]);
                    list.add(nums[i]);
                    list.add(nums[right]);
                    res.add(list);

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left ++;
                    right--;
                
        }
                 
                else if(nums[left] + nums[i]+nums[right]<0){
                    left++;
                }
                

                 else if( nums[left] + nums[i]+nums[right]>0){
                    right--;
                }
            }

        }

        return res;
        
    }
}
