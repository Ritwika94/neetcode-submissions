class Solution {
    public boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean[board.length][board[0].length];
       for(int i =0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if( dfs(i,j,0,board,word,visited)){
                    return true;
                };
            }
        }

        return false;
    }
    public boolean dfs(int i, int j,int index,char[][] board, String word,boolean visited[][]){
        if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length ||j >=board[0].length ||visited[i][j]
        || word.charAt(index)!=board[i][j]){
            return false;
        }
        visited[i][j]=true;
        boolean found = dfs(i+1,j,index+1,board,word,visited)||
        dfs(i-1,j,index+1,board,word,visited)||
        dfs(i,j+1,index+1,board,word,visited) ||
        dfs(i,j-1,index+1,board,word,visited);
        visited[i][j]=false;
        return found;

    }
    
}
