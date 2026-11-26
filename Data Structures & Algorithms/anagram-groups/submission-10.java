class Solution {
    List<List<String>> res = new ArrayList();
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap = new HashMap();
        for(int i=0;i<strs.length;i++){
            String temp =strs[i];
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s1 = new String(chars);

            hmap.computeIfAbsent(s1,k-> new ArrayList()).add(temp);
        }
        for(Map.Entry<String,List<String>> entry: hmap.entrySet()){
            res.add(entry.getValue());
        }

        return res;

        
        
    }
}
