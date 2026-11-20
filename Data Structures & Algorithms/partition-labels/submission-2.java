class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hmap =new HashMap();
        for(int i=0;i<s.length();i++){
            hmap.put(s.charAt(i),i);
        }
        int start =0;
        List<Integer> list=new ArrayList();
        int i=0;
        int end =0;
    
        while(i<s.length()){
            char c= s.charAt(i);
            end = Math.max(end,hmap.get(c));
            System.out.println(" end: "+ end);
            if(i==end){
                System.out.println(i+ " "+ end);
                int len =end-start+1;
                
                start=end +1;
                list.add(len);

            }
            i++;
        }

        return list;

        
    }
}
