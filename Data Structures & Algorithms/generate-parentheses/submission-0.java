class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
         generate(2*n ,n,n,"" ,list);
         return list;
        
    }

    public void generate(int length ,int left,int right, String s,List<String> list){
        if(s.length() == length){
            list.add(s);
            return;
        }

        if(left > 0){
            generate(length, left-1, right, s+"(", list);
        }

        if(right> left){
            generate(length, left, right-1, s+")", list);
        }
    }
}
