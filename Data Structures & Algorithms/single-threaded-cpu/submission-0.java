class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        for (int i = 0; i < n; i++) {
            tasks[i] = new int[] {tasks[i][0], tasks[i][1], i};
        }
        Arrays.sort(tasks, Comparator.comparingInt(t -> t[0]));
    PriorityQueue<int[]>pq =new PriorityQueue<>(
        (a,b)->(a[0]==b[0])?(a[1]-b[1]): a[0]-b[0]);
     int i=0, idx=0;
     long time=tasks[0][0]  ; 
    
    int[] res = new int[n];
    while(i< tasks.length  || !pq.isEmpty()){
        while(i<n && time>=tasks[i][0]){
            pq.offer(new int []{tasks[i][1],tasks[i][2]});
            i++;
        }
        if(pq.isEmpty()){
            time = tasks[i][0];
        }
        else{
            int[] task=pq.poll();
            res[idx++]=task[1];
            time += task[0];
        }
    }
    return res;
    }
}