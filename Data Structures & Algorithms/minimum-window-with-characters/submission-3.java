class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> target =new HashMap<>();
        for(int i=0;i<t.length();i++){
                          
    target.put(t.charAt(i),target.getOrDefault(t.charAt(i),0)+1);
        }

        int formed =0;
        int left =0;
        int minLen =Integer.MAX_VALUE;
        int start =0;
        Map<Character,Integer> window =new HashMap<>();
        for(int i=0;i<s.length();i++){
              char c =s.charAt(i);  window.put(s.charAt(i),window.getOrDefault(s.charAt(i),0)+1);

        if(target.containsKey(c) &&  
        window.get(c).equals(target.get(c))){
            formed ++;
        }

        while(formed == target.size()){
            if(i-left+1 <minLen){
                minLen =i-left+1;
                start=left;
            }
            char c1 =s.charAt(left); 
            window.put(c1,window.getOrDefault(c1,0)-1);
            if(target.containsKey(c1) && window.get(c1)< target.get(c1)){
                
                formed --;
            }
            left++;
        }
        }
   return minLen == Integer.MAX_VALUE ?"":s.substring(start,start+minLen);
          
    }
}
