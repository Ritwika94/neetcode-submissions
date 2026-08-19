class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n =intervals.length;
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int a[], int b[]){
                return a[0]-b[0];
            }
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        int count =0;

        for(int i =1; i<n; i++){
            
            if(intervals[i][0]<end){
                System.out.println(intervals[i][0] + " "+ end);
                count ++;
                end =Math.min(intervals [i][1],end);
            }
            else{
                end =intervals[i][1];
            }

            
        }

        return count;
        
    }
}
