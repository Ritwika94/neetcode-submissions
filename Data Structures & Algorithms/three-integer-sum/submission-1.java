class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list =new ArrayList();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l =i+1;
            int r =nums.length-1;
            while(l<r){
                
                if(nums[i]+nums[l]+nums[r]== 0){
                    List<Integer> list1=new ArrayList();
                    list1.add(nums[i]);
                    list1.add(nums[l]);
                    list1.add(nums[r]);
                    list.add(list1);
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                }
                else if (nums[i]+nums[l]+nums[r]> 0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
            return list;
        }
        
        
}

