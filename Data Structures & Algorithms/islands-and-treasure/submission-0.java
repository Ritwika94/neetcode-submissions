class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n= grid.length;
        int m =grid[0].length;
        int [][] copy =new int[n][m];
      
        for (int i = 0; i < n; i++) {
    copy[i] = grid[i].clone();
}
        Queue<int[]> q = new LinkedList<>();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
         find(q,n,m,0,copy,grid);
         for (int i = 0; i < n; i++) {
    grid[i] = copy[i].clone();
}
    }
    public int[][] find(Queue<int[]> q ,int n,int m, int distance ,int[][] copy,int[][] grid){
        while(!q.isEmpty()){
            distance ++;
            int size =q.size();
            while(size>0){
                int[] arr =q.poll();
                int x = arr[0]+1;
                int y =arr[1];
                if(x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == Integer.MAX_VALUE){
                    grid[x][y]=0;
                    copy[x][y]=distance;
                    q.add(new int[]{x,y});
                }
                 x = arr[0]-1;
                 y =arr[1];
                if(x>= 0 && x < n && y >= 0 && y < m && grid[x][y] == Integer.MAX_VALUE){
                    grid[x][y]=0;
                    copy[x][y]=distance;
                    q.add(new int[]{x,y});
                }
                 x = arr[0];
                 y =arr[1]+1;
                if(x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == Integer.MAX_VALUE){
                    grid[x][y]=0;
                    copy[x][y]=distance;
                    q.add(new int[]{x,y});
                }
                 x = arr[0];;
                 y =arr[1]-1;
                if(x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == Integer.MAX_VALUE){
                    grid[x][y]=0;
                    copy[x][y]=distance;
                    q.add(new int[]{x,y});
                }
                size--;
                 
            }
        }

        return copy;
    }
}
