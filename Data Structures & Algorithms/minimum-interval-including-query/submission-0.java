class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int [][] q =new int[queries.length][2] ;

        for(int i =0;i<queries.length;i++)  {
            q[i][0]=queries[i];
            q[i][1]=i;
        } 
        int i =0;
        Arrays.sort(q,(a,b)->a[0]-b[0]) ;
        int res[]=new int[queries.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        for(int[]q1 : q){
            int val =q1[0];
            int idx =q1[1];
            ;
            while(i<intervals.length && intervals[i][0]<=val){
                int start =intervals[i][0];
                int end =intervals[i][1];
                int duration = end-start+1;
                pq.offer(new int[]{duration,end});
                i++;
            }
            while(!pq.isEmpty() && pq.peek()[1]<val){
                pq.poll();
            }

            if(!pq.isEmpty()){
                res[idx]=pq.peek()[0];
            }
            else{
                res[idx] = -1;
            }
        }

        return res;
    }
}
