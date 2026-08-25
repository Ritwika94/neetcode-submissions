class Solution {
    

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.isEmpty()){
            return "";
        }
        for(int i =0;i<strs.size();i++){
            int len =strs.get(i).length();
            sb.append(len);
            sb.append("#");
            sb.append(strs.get(i));
        }
        return sb.toString();
        
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int j =i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len =Integer.parseInt(str.substring(i,j));
            i =j+1;
            j=i+len;
            res.add(str.substring(i,j));
            i=j;

        }
        return res;
    }
}
