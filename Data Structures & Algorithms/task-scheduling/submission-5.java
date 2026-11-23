class Solution {
    public int leastInterval(char[] tasks, int n) {
        int m=tasks.length;
        char freq[]=new char[26];
        for(int i =0;i<m;i++){
            freq[tasks[i]-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int f : freq){
            if(f>0){
                pq.add(f);
            }
        }
        Queue<int[]> q =new LinkedList();
        int time =0;
        while(!pq.isEmpty() || !q.isEmpty()){
            time++;
            if(!pq.isEmpty()){
                int f = pq.poll();
                f--;
                if(f>0){
                    q.add(new int[]{f, time+n});
                }
            }
            
            while(!q.isEmpty() && q.peek()[1]==time){
                pq.add(q.poll()[0]);
            }

        }

        return time;

    }
        
    
}
