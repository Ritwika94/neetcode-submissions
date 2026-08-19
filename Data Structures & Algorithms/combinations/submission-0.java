class Solution {
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> combine(int n, int k) {
        int arr[]=new int[n];
        for(int i =1;i<=n;i++){
            arr[i-1]=i;
        }
        List<Integer> curr =new ArrayList();
        backtrack(0,0,arr,curr,k );
        return res;
        
    }

    public void backtrack(int i,int count, int []arr,List<Integer> curr,int k){
        
        if(count ==k){
            res.add(new ArrayList(curr));
            return;
        }
        for(int j=i;j<arr.length;j++){

            curr.add(arr[j]);
            backtrack(j+1,count+1, arr,curr,k);
            curr.remove(curr.size()-1);

        }
    }
}