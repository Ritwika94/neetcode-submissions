
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
class Solution {
    
    TrieNode root;

    public Solution() {
         root=new TrieNode();
    }
    public int minExtraChar(String s, String[] dictionary) {
        for(int i =0;i<dictionary.length;i++){
            insert(dictionary[i]);
        }

        return search(s);

    
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

    public int search(String s) {
      int n =s.length();
      int dp[]=new int[n+1];
     
      for(int i =n-1;i>=0;i--){
        TrieNode node = root;
        dp[i]=1+ dp[i+1];
        for(int j=i;j<n;j++){
            int idx = s.charAt(j)-'a';
            if(node.children[idx]==null)
                break;

            node = node.children[idx];
            if(node.isEnd== true){
                dp[i]= Math.min(dp[i],dp[j+1]);
            }
        }
      }

      return dp[0];
    }
    
}