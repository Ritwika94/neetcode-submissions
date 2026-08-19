class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones){
            q.offer(i);
        }
        while(q.size()>=2){

            int x = q.poll();
            int y = q.poll();
            if(x!=y){
                q.add(x-y);
                System.out.println(y-x);

            }
        }
        
    

        return q.isEmpty() ? 0 : q.peek();
        
        
    }
}
