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
        TrieNode p=root;
        for(int i =0;i<word.length();i++){
            int ch = word.charAt(i)-'a';
            if(p.children[ch]==null){
               return false;
            }
            p=p.children[ch];
        }
        return p!=null && (p.isEnd ==true);
    }

    public boolean startsWith(String prefix) {
        TrieNode p=root;
        for(int i =0;i<prefix.length();i++){
            int ch = prefix.charAt(i)-'a';
            if(p.children[ch]==null){
               return false;
            }
            p=p.children[ch];
        }
        return p!=null ;

    }
}
