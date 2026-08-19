class Solution {
    List<List<Integer>> res=new ArrayList() ;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        findcombo(nums,0, nums.length,0, list, target);
        return res;
    }

    public void findcombo(int[] nums, int start, int end, int sum, List<Integer> list, int target){
        if(target == sum){
             res.add(new ArrayList<>(list));
            return;
        }

        if(target< sum){
            return;
        }

        for(int i = start;i<end;i++){
            list.add(nums[i]);
            findcombo(nums, i, end,sum+nums[i],list,target);
            list.remove(list.size()-1);
        
        }
    }

    

}
