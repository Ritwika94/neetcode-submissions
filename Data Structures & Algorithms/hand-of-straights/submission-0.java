class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       Map<Integer,Integer>  count =new HashMap();
      for(int n : hand){
        count.put(n, count.getOrDefault(n,0)+1);
        
      }
      Arrays.sort(hand);
      for(int n : hand){
        if(count.get(n)>0){
            for(int i =n ;i<n+ groupSize;i++){
                if (count.getOrDefault(i, 0) == 0) return false;
                count.put(i, count.get(i)-1);
            }
        }
        
      }

      return true;
    }
}
