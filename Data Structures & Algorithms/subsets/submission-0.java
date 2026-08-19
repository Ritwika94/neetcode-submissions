class Solution {
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList();
        subset(nums,0,nums.length,list);
        return res;
        
    }
    public void subset(int[] nums,int start, int end, List<Integer> list ) {
        
            res.add(new ArrayList(list));
        
        if(start>=end ) return;
        for(int i =start;i<end;i++){
            list.add(nums[i]);
            subset(nums,i+1,end,list);
            list.remove(list.size()-1);
        }
        
    }
}
