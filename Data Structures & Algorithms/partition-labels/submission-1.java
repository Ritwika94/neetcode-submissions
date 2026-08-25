class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList();
        Map<Character, Integer> hmap =new HashMap();
        for(int i =0;i<s.length();i++){
            hmap.put(s.charAt(i),i);
        }
        int end =0;
        int size=0;
        for(int i =0;i<s.length();i++){
            size++;
            end =Math.max(end, hmap.get(s.charAt(i)));
            if(i==end){
                res.add(size);
                size =0;

            }
        }

        return res;
        
    }
}
