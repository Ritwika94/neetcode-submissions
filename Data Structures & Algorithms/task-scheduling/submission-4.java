class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks.length==0) return 0;
        int []freq= new int[26];
        for(int i =0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }

        PriorityQueue<Integer> pq =new PriorityQueue( (Collections.reverseOrder()));
        for(int i =0;i<26;i++){
            if(freq[i]>0){
                pq.offer(freq[i]);
            }
        }

        Queue<int[]> cooldown =new LinkedList();
        int t=0;
        while(!pq.isEmpty() || !cooldown.isEmpty()){
            t++;
            if(!pq.isEmpty()){
                int f = pq.poll();
           f--;
           if(f>0){
            cooldown.add(new int[]{f, t+n});
           }
        }
           

           while(!cooldown.isEmpty() && cooldown.peek()[1]== t){
            pq.add(cooldown.poll()[0]);
           }
        }
        return t;

    }
        
    
}
