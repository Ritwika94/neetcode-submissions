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
class PrefixTree {
    TrieNode root;

    public PrefixTree() {
         root=new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        int n=word.length();
        for(int i =0;i<n;i++){
            char ch = word.charAt(i);
           if(node.children[ch-'a']==null){
                node.children[ch-'a']=new TrieNode();
           }
           node = node.children[ch-'a'];

        }
        node.isEnd =true;
        

    }

    public boolean search(String word) {
        TrieNode node = root;
        int n=word.length();
        for(int i =0;i<n;i++){
            char ch = word.charAt(i);
           if(node.children[ch-'a']==null){
                return false;
           }
           node = node.children[ch-'a'];

        }
        return node!=null && node.isEnd ==true;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        int n=prefix.length();
        for(int i =0;i<n;i++){
            char ch = prefix.charAt(i);
           if(node.children[ch-'a']==null){
                return false;
           }
           node = node.children[ch-'a'];

        }
        return node!=null;
    }
}
