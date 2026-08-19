class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int n: nums){
            if(hset.contains(n)){
                return n;
            }
            hset.add(n);
        }
        return -1;

        
    }
}
