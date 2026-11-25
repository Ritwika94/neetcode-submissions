class Solution {
    List<String> list =new ArrayList();
    public List<String> generateParenthesis(int n) {
      
        generate(2*n,n,n,"",0);
        return list;
        
    }
    public void generate(int len, int l,int r, String s,int i) {
        if(i==len){
            list.add(s);
            return;
        }
        if(l>0){
            generate(len,l-1,r,s+"(",i+1);
        }
        if(l<r){
           generate(len,l,r-1,s+")",i+1); 
        }
        
    }
}
