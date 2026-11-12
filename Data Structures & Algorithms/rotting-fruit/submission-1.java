class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q =new LinkedList<>();
        for(int i=0;i<grid.length;i++ ){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        
        int time =0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int [] points =q.poll();
                int r=points[0];
                int c=points[1];
                if( c+1<grid[0].length && grid[r][c+1]==1){
                    q.add(new int[]{r,c+1});
                    grid[r][c+1]=2;

                }
                 if( c-1>=0 && grid[r][c-1]==1){
                    q.add(new int[]{r,c-1});
                    grid[r][c-1]=2;

                }
                 if( r+1<grid.length && grid[r+1][c]==1){
                    q.add(new int[]{r+1,c});

                    grid[r+1][c]=2;

                }
                 if( r-1>=0 && grid[r-1][c]==1){
                    q.add(new int[]{r-1,c});

                    grid[r-1][c]=2;

                }
            }
            if (!q.isEmpty()) {
                time++;
            }
    
        }
        for(int i=0;i<grid.length;i++ ){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }

        return time;
        
    }
}
