class TrieNode{
    TrieNode[] children = new TrieNode[26];
    int idx =-1;
    int ref=0;
    void insert(String word, int i){
        TrieNode curr =this;
        curr.ref++;
        for(char c : word.toCharArray()){
            int idx =c-'a';
            if(curr.children[idx]==null){
                curr.children[idx] =new TrieNode();

            }
            curr=curr.children[idx];
            curr.ref++;
        }
        curr.idx =i;
    }
}

class Solution {
     List<String> res = new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root =new TrieNode();
        for(int i =0;i<words.length;i++){
            root.insert(words[i],i);
        }
        int r =board.length;
        int c=board[0].length;
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                dfs(root,i,j, board, words);
            }
        }

        return res;

    }

    public void dfs(TrieNode node, int r, int c,char[][] board, String[] words){
        if (r < 0 || r >= board.length || 
    c < 0 || c >= board[0].length ||
    board[r][c] == '*' ||
    node.children[board[r][c] - 'a'] == null) {
    return;
}
        char temp = board[r][c];
        board[r][c]= '*';
        TrieNode prev=node;
        node = node.children[temp -'a'];
        if(node.idx !=-1){
            res.add(words[node.idx]);
            node.idx = -1;
            node.ref--;
            if(node.ref==0){
                prev.children[temp -'a']=null;
                node =null;
                board[r][c] = temp;
                return;
            }

        }
        dfs(node,r+1,c,board,words);
        dfs(node,r-1,c,board,words);
        dfs(node,r,c+1,board,words);
        dfs(node,r,c-1,board,words);
        board[r][c] = temp;
    }
}
