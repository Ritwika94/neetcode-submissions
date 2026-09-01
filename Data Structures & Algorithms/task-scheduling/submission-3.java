class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (tasks.length ==0){
            return 0;
        }
        int freq[]=new int[26];
        for(int i =0;i< tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        PriorityQueue<Integer> pq =new PriorityQueue(Collections.reverseOrder());
        for(int f :  freq){
            if(f>0){
                pq.offer(f);
            }
        }
        Queue<int[]> cooldown = new LinkedList();
        int time =0;
        while(!pq.isEmpty() || !cooldown.isEmpty()){
            time++;
            if(!pq.isEmpty()){
                int f= pq.poll();
            f--;
            if(f>0){
                cooldown.add(new int[]{f, time+n});
            }

        }
        while(!cooldown.isEmpty() && cooldown.peek()[1]==time){
            pq.add(cooldown.poll()[0]);
        }
            
        }
        return time;

    }
        
    
}
