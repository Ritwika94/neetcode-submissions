class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hset =new HashSet<>();
        for(int n :nums){
            if(hset.contains(n)){
                return true;
            }
            hset.add(n);

            
        }

        return false;
        
    }
}