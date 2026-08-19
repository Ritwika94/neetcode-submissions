class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t)){
            return 0;
        }
        int i=0;
        int j=0; 
        int count = 0;
       while( i< s.length() && j<t.length()){
        System.out.println(t.charAt(j) + " "+s.indexOf(t.charAt(j)));
        if(s.charAt(i)==(t.charAt(j))){
                i++;
                j++;
            }
            else{
                    i++;
            }
        

       }   

       return  t.length()-j;
      
    }
}