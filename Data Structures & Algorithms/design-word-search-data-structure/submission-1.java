class TrieNode{
    boolean isEnd;
    TrieNode children[]=new TrieNode[26];
    TrieNode()
    {
        isEnd =false;
        for(int i =0;i<26;i++){
            children[i]=null;
        }
    }
}
class WordDictionary {
    TrieNode root;
    public WordDictionary() {
         root=new TrieNode();

    }

    public void addWord(String word) {
        TrieNode p=root;
        for(int i =0;i<word.length();i++){
            int ch = word.charAt(i)-'a';
            if(p.children[ch]==null){
               p.children[ch] = new TrieNode();
            }
            p=p.children[ch];
        }
        p.isEnd =true;
    }

    public boolean search(String word) {
        return dfs(0,word,root);
    }
    public boolean dfs(int i, String word, TrieNode node){
        if(i == word.length()){
            return node.isEnd;
        }
        char c = word.charAt(i);
        if(c !='.'){
            int ch = c-'a';
            if(node.children[ch]!=null){
                return dfs(i+1, word, node.children[ch]);
            }
            else{
                return false;
            }
        }
        else{
            for(int k =0;k<26;k++){
                if (node.children[k] != null) {
                    if (dfs(i+1,word ,node.children[k])) {
                        return true;
                    }
                }
                        

            }
        }

        return false;
    }

}
