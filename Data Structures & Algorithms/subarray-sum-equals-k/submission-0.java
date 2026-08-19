class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hmap =new HashMap<>();
        int sum=0;
        int count =0;
        hmap.put(0,1);
        for(int n :nums){
            sum+=n;
            if(hmap.containsKey(sum-k)){
                count+=hmap.get(sum-k);
            }
            hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }

        return count;
        
    }
}