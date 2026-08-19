class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(int i =0;i< strs.length;i++){
            char arr []=strs[i].toCharArray();
            Arrays.sort(arr);
            String s1 =new String(arr);
            

            hmap.computeIfAbsent(s1,key->new ArrayList()).add(strs[i]);
        }

        for(Map.Entry<String, List<String>> entry : hmap.entrySet()){
            res.add(entry.getValue());
        }

        return res;
        
    }
}
