class Solution {
    List<String> list=new ArrayList();
    Set<String> wordSet;
    public List<String> wordBreak(String s, List<String> wordDict) {
    
        wordSet = new HashSet<>(wordDict);
        List<String> curr=new ArrayList();
        backtrack(s,0,curr);
        return list;
    }

    public void backtrack( String s,int i,List<String> curr){
        if(i==s.length()){
            list.add(String.join(" ",curr));
            return;
        }
        for(int j =i;j<s.length();j++){
            String str = s.substring(i,j+1);
            if(wordSet.contains(str)){
                curr.add(str);
                backtrack(s,j+1,curr);
                curr.remove(curr.size()-1);

            }
        }
    }
}