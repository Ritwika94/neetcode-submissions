class Solution {
    public int mostBooked(int n, int[][] meetings) {
        PriorityQueue<long[]> used =new PriorityQueue<long[]>((a, b) -> a[0] != b[0] ? Long.compare(a[0], b[0]) : Long.compare(a[1], b[1]));
        PriorityQueue<Integer> unused =new PriorityQueue<>((a,b) ->a-b);
        int maxAvailable[]=new int[n];
        for (int i = 0; i < n; i++) {
            unused.offer(i);
        }
        Arrays.sort(meetings, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        for(int i =0;i<meetings.length;i++){
            int start =meetings[i][0];
            int end =meetings[i][1];
            while(!used.isEmpty()&&start>=used.peek()[0]){
                    unused.add((int)used.poll()[1]);
            }
            if(!unused.isEmpty()){
                long room= (int)unused.poll();
                used.add(new long[]{end,room});
                maxAvailable[(int)room]++;

            }
            else{
                long arr[]=used.poll();
                used.offer(new long[]{arr[0]+(end -start),arr[1]});
                maxAvailable[(int)arr[1]]++;
                
            }

        }
        int maxMeetingCount = 0, maxMeetingCountRoom = 0;
        for (int i = 0; i < n; i++) {
            if (maxAvailable[i] > maxMeetingCount) {
                maxMeetingCount = maxAvailable[i];
                maxMeetingCountRoom = i;
            }
        }

        return maxMeetingCountRoom;
        
    }
}