class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length; // no cooldown


        int freq[]=new int[26];

        for(char c : tasks){
            freq[c - 'A']++;
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int f : freq){
            if (f > 0) q.offer(f);
        }

        Queue<int []> cool = new LinkedList();
        int time = 0;
        while(!q.isEmpty() || !cool.isEmpty()){
    time++;
    if(!q.isEmpty()){
        int freq1 = q.poll() - 1;
        if(freq1 > 0){
            cool.add(new int[]{freq1, time + n});
        }
    }

    // Check for any tasks that have completed their cooldown
    while(!cool.isEmpty() && cool.peek()[1] == time){
        q.offer(cool.poll()[0]);
    }
}
        return time;
        
    }
}
