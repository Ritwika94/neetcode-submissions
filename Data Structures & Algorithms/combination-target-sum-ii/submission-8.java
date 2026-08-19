class Solution {
    List<List<Integer>> res =new ArrayList();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList();
        int sum =0;
        Arrays.sort(candidates);
        combine(candidates,target,list,0,candidates.length-1,sum);
        return res;
    }
    public void combine(int[] candidates, int target, List<Integer> list,int start,int end,int sum) {
        if(sum ==target){
            if(!res.contains(list)){
                res.add(new ArrayList(list));
                return;
            }
            
        }
        if(sum>target) 
			return;

        for(int i=start;i<=end;i++){
            if (i > start && candidates[i] == candidates[i - 1]) continue;


            list.add(candidates[i]);
            combine(candidates,target, list,i+1,end,sum+candidates[i]);
            list.remove(list.size()-1);

        }
    }
}
