class Solution {
    

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.size() ==0){
            sb.toString();
        }
        for(int i =0;i<strs.size();i++){
            sb.append(strs.get(i).length()).append('#').append(strs.get(i));
        }
      
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int j =i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
             i =j+1;
             j=i+length;
             res.add(str.substring(i,j));
             i=j;
        }
        return res;
    }
}
