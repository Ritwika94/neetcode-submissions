class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        if(s.length()==1){
            return s;
        }
        int left =0;
        int right =0;
int max = Integer.MIN_VALUE;        
String s1="";
        for(int i =0;i< s.length();i++){
            left =i;
            right =i;
            while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right - left + 1 > max){
                    max = right - left + 1;
                    s1 = s.substring(left, right + 1);
                }
                left--;
                right ++;
            }
            
          
        }
        for(int i =0;i< s.length();i++){
            left =i;
            right =i+1;
            while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right - left + 1 > max){
                    max = right - left + 1;
                    s1 = s.substring(left, right + 1);
                }
                left--;
                right ++;
            }
            
          
        }

        return s1;
        
    }
}
