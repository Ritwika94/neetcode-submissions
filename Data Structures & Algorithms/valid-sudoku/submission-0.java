class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer, HashSet<Character>> rows =new HashMap();
        Map<Integer, HashSet<Character>> cols =new HashMap();
        Map<String, HashSet<Character>> box =new HashMap();

        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                if(board[i][j]=='.') continue;
                String key = (i/3)+","+(j/3);

                if(rows.computeIfAbsent(i,k->new HashSet()).contains(board[i][j])||
                cols.computeIfAbsent(j,k->new HashSet()).contains(board[i][j])||
                box.computeIfAbsent(key,k->new HashSet()).contains(board[i][j])
                ){
                    return false;
                }

                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                box.get(key).add(board[i][j]);


            }
        }

        return true;
        
    }
}
