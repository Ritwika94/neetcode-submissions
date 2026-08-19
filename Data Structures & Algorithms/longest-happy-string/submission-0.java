class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();
        PriorityQueue<int[]> h = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        if(a>0)h.offer(new int[]{a,'a'});
         if(b>0)h.offer(new int[]{b,'b'});
          if(c>0)h.offer(new int[]{c,'c'});

          while(!h.isEmpty()){
            int[] first= h.poll();
            if(res.length()>1 && res.charAt(res.length()-1)==first[1] &&
            res.charAt(res.length()-2)==first[1]){
                if (h.isEmpty()) break;
                int second[]=h.poll();
                res.append((char) second[1]);
                second[0]--;
                if(second[0]>0){
                    h.offer(second);
                }
                h.offer(first);
            }
            else{
                res.append((char) first[1]);
                first[0]--;
                if(first[0]>0){
                    h.offer(first);
                }
            }

          }
            return res.toString();

    }
}