class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s1=new Stack();
        for(String s : operations){
        
             if(s.equals("+")){
                int a =s1.pop();
                int b =s1.pop();
                int c =a+b;
                
                s1.push(b);
                s1.push(a);
                s1.push(c);
            }
            else if(s.equals("D")){

                int d = s1.isEmpty() ? 0 :s1.pop();
                int k = 2*d;
                s1.push(d);
                s1.push(k);
            }
            else if(s.equals("C")){
                s1.pop();
            }
            else {
                s1.push(Integer.parseInt(s)); // handles negative
            }
        }
        int sum =0;
        int size =s1.size();
        for(int i =0;i<size;i++){
            sum+=s1.pop();
        }

        return sum;
        
    }
}