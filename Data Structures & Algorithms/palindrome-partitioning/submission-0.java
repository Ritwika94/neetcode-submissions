class Solution {
    List<List<String>> res = new ArrayList();
    public List<List<String>> partition(String s) {
        List<String> list =new ArrayList();
        dfs(0,s,list);
        return res;
        
    }

    public void dfs(int i,String s, List<String> list){
        if(i>=s.length()){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int j=i;j<s.length();j++){
            if(isPali(s,i,j)){
                list.add(s.substring(i,j+1));
                dfs(j+1,s,list);
                list.remove(list.size() -1);
            }
        }
    }

    private boolean isPali(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
