class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols= board[0].length;
        for(int r =0;r<rows ;r++){
            if(board[r][0]=='O')
                capture(board,r,0);
            if(board[r][cols-1]=='O')
                capture(board,r,cols-1);
        }
        for(int c =0;c<cols;c++){
            if(board[0][c]=='O')
                capture(board,0,c);
            if(board[rows-1][c]=='O')
                capture(board,rows-1,c);
        }
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(board[i][j]=='O'){
                   board[i][j] = 'X'; 
                }
                if(board[i][j]=='T'){
                   board[i][j] = 'O'; 
                }
            }
        }
}
public void capture(char[][] board, int r, int c){
    if(r>=board.length|| r<0 || c<0 || c>=board[0].length ||board[r][c]!='O' ){
        return;
    }
    board[r][c]='T';
    capture(board,r-1,c);
    capture(board,r+1,c);
    capture(board,r,c-1);
    capture(board,r,c+1);
}
}
