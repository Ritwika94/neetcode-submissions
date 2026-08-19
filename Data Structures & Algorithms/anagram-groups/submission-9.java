class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(int i =0;i< strs.length;i++){
            char arr []=strs[i].toCharArray();
            int count[] = new int[26];
            for(char ch: arr){
                count[ch-'a']++;
            }
            StringBuilder s1 =new StringBuilder();
            for (int j =0;j<26;j++){
                s1.append('#');
                s1.append(count[j]);
            }
            

            hmap.computeIfAbsent(s1.toString(),key->new ArrayList()).add(strs[i]);
        }

        for(Map.Entry<String, List<String>> entry : hmap.entrySet()){
            res.add(entry.getValue());
        }

        return res;
        
    }
}
