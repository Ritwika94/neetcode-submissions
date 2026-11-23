class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hset =new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char d =board[i][j];
                if (d == '.') continue;
                if((!hset.add(d+ "is in row"+ i))||
                !(hset.add(d+ "is in col"+ j)) ||
                  !(hset.add(d+ "is in quarter"+ i/3+" "+j/3))){
                    return false;
                  }

            }
        }

        return true;
    }
}
