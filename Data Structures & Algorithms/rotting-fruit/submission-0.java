class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList();
        for(int i =0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==2)
                q.add(new int[]{i,j});
            }
        }
        int time = 0;
        while(!q.isEmpty()){
            int size =q.size();
            
            System.out.println("size:"+ size + " "+time);
            for(int k=0;k< size;k++){
                
                int[] cell = q.poll();
                int row =cell[0];
                int col=cell[1];
                if(row +1 < grid.length && grid[row+1][col]==1){
                    System.out.println("hi1");
                    grid[row+1][col]=0;
                    q.add(new  int[]{row +1,col});
                }

                if(row-1>=0 && grid[row-1][col]==1){
                    System.out.println("hi2");
                    grid[row-1][col]=0;
                    q.add(new  int[]{row -1,col});
                }

                if(col+1< grid[0].length && grid[row][col+1]==1){
                    System.out.println("hi3");
                    grid[row][col+1]=0;
                    q.add(new  int[]{row,col+1});
                }

                if(col-1>=0 && grid[row][col-1]==1){
                    System.out.println("hi4");
                    grid[row][col-1]=0;
                    q.add(new  int[]{row,col-1});
                }
                
            }
            if(!q.isEmpty()) time++;
        }

        for(int i =0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            System.out.println(grid[i][j]);
               if(grid[i][j] ==1){
                    return -1; 
               }
                
            }
            }
        return time;
        
    }
}
