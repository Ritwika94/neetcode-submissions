class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
     
      if (hand.length % groupSize != 0) {
        return false;
    }
    HashMap<Integer,Integer> hmap =new HashMap<>();
    for(int i =0;i<hand.length;i++){
      hmap.put(hand[i],hmap.getOrDefault(hand[i],0)+1);
    }
    Arrays.sort(hand);
    for(int n : hand){
      if(hmap.get(n)>0){
        for(int i =n;i<n+groupSize;i++){
          if(hmap.getOrDefault(i, 0)==0){
            return false;
          }
          hmap.put(i, hmap.get(i)-1);
        }
      }
    }

    return true;
}

    
}
