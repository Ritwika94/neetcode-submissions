class Solution {
    List<List<Integer>> res =new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList();
        find(0,nums.length,nums);

        return res;
        
    }
    public void find(int start,int end , int[] nums ) {
        if(start ==nums.length){
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(new ArrayList(list));
            return;
        }
        if(start> end){
            return;
        }

        for(int i = start; i < end ;i++){
            swap(nums,i,start);
            find(start+1, end,nums);
            swap(nums,i,start);
        }

    }

    static void swap(int[]nums, int i, int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
