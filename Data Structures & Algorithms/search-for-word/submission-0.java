class Solution {
    public boolean exist(char[][] board, String word) {

        int n=board.length;
        int m =board[0].length;
        boolean visited[][]=new boolean[n][m];

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if( dfs(i,j,n , m,board,word,0,visited)){
                    return true;
                };
            }
        }

        return false;
        
    }

    public boolean dfs(int i,int j,int n,int m, char[][] board, String word,int index,boolean[][] visited){
         if (index == word.length()) return true;
        if(i <0 || i>=n || j<0 ||j >=m || board[i][j] != word.charAt(index) || visited [i][j] == true ){
            return false;
        }

        visited[i][j]=true;
        boolean found =dfs(i+1,j,n,m,board, word, index+1, visited)||
                        dfs(i-1,j,n,m,board, word, index+1, visited) ||
                        dfs(i,j+1,n,m,board, word, index+1, visited)||
                        dfs(i,j-1,n,m,board, word, index+1, visited);

        visited[i][j]=false;
        return found;
    }
}
