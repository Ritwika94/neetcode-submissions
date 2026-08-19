class Solution {
    public int[][] kClosest(int[][] points, int k) {

// Min heap: points ordered by distance from origin
        PriorityQueue<int[]> q = new PriorityQueue<>(
            (a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])
        );        for(int i =0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];

            q.add(new int[]{x,y});
        }

        ArrayList<int[]> a = new ArrayList<>();

int i = 0;
while (i < k && !q.isEmpty()) {
    int[] x = q.poll();
    a.add(new int[]{x[0], x[1]});
    i++;  // increment counter!
}

        int[][] result = a.toArray(new int[a.size()][]);
        return result;
        

    }
}
