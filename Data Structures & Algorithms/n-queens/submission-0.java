class Solution {
    List<List<String>> res =new ArrayList();
    public List<List<String>> solveNQueens(int n) {
        int nQueen[]=new int[n];
        Arrays.fill(nQueen, -1);

        Set<Integer> cols = new HashSet<>();
        Set<Integer> diag1 = new HashSet<>(); // row - col
        Set<Integer> diag2 = new HashSet<>(); // row + col

        backtrack(0,n,nQueen,cols,diag1,diag2);
        return res;
        
    }
    public void backtrack(int row, int n, int[] nQueen,
                           Set<Integer> cols,
                           Set<Integer> diag1,
                           Set<Integer> diag2) {
        if(row == n){
            buildBoard(nQueen,n);
            return;
        }
        for(int col =0;col<n;col++){
            if(cols.contains(col) || diag1.contains(row +col)
            || diag2.contains(row -col)){
                continue;
            }
            nQueen[row ]=col;
            cols.add(col);
            diag1.add(row+col);
             diag2.add(row-col);
             backtrack(row +1,n,nQueen,cols,diag1,diag2);;
             nQueen[row ]=-1;
            cols.remove(col);
            diag1.remove(row+col);
             diag2.remove(row-col);
        }
    }

        public void buildBoard(int[] nQueen, int n){
            List<String> board = new ArrayList();
            for(int i=0;i<n;i++){
                char arr[]=new char[n];
                Arrays.fill(arr, '.'); 
                arr[nQueen[i]]='Q';
                board.add(new String(arr));
            }
            res.add(board);
        }
        
    
}
