class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks.length ==0){
            return 0;
        }
        int freq[]=new int[26];
        for(char c : tasks){
            freq[c-'A']++;
        }
        PriorityQueue<Integer> q =new PriorityQueue<>(Collections.reverseOrder());
        for(int f: freq){
            if(f>0)
                q.offer(f);
        }
        Queue<int[]> cool =new LinkedList<>();
        int time =0;
        while(!q.isEmpty() || !cool.isEmpty()){
            System.out.println("hi");
            time++;
            if(!q.isEmpty()){
                int f = q.poll()-1;
            if(f>0){
                cool.add(new int[]{f, time +n});
            }
            }
            
            while(!cool.isEmpty() && cool.peek()[1]==time){
                q.add(cool.poll()[0]);
            }


        }
        return time;

        
    }
}
