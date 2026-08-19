class Solution {
    public String minWindow(String s, String t) {
        int minLen=Integer.MAX_VALUE;
        HashMap<Character,Integer> target = new HashMap<>();
        for(char c : t.toCharArray()){
            target.put(c, target.getOrDefault(c,0)+1);
        }
        int left =0;
        int start =0;
        int formed =0;
        Map<Character, Integer> window = new HashMap<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            window.put(c, window.getOrDefault(c,0)+1);
            if(target.containsKey(c) && window.get(c).intValue() ==target.get(c).intValue() ){
                formed ++;
            }
            while(formed == target.size()){
                if(i -left+1<minLen){
                    minLen= i -left+1;
                    start =left;
                }
                char c1=s.charAt(left);
                window.put(c1, window.getOrDefault(c1,0)-1);
                if(target.containsKey(c1) && window.get(c1)<target.get(c1)){
                formed--;
            }
            left ++;

            }
        }
        return minLen == Integer.MAX_VALUE ? "":s.substring(start,start+minLen);
        
    }
}
