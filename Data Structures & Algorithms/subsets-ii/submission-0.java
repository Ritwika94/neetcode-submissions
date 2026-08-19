class Solution {
   Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        Arrays.sort(nums);
        subsets(nums, 0, nums.length, list);
        return new ArrayList<>(res);
        
    }
    public void subsets(int[] nums, int i, int n,ArrayList<Integer> list) {
        if(i == n){
            res.add(new ArrayList(list));
            return;
        }
        
            list.add(nums[i]);
            subsets(nums,i+1,n, list);
            list.remove(list.size()-1);
            subsets(nums,i+1,n, list);
        
    }

}
