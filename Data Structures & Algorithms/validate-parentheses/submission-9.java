class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        char arr[] = s.toCharArray();
        for(char c : arr){
            if(c == '(' || c =='{' || c=='['){
                System.out.println("hi1");
                stack.push(c);
            }

            else {
                if (stack.isEmpty()) return false;

            
            if(c == ')' ){
                if(stack.peek()=='(')
                    stack.pop();

                    else return false;
                
            }
            

            if(c == '}'  ){
                if(stack.peek()=='{')
                    stack.pop();

                    else return false;
                
            }
            

            if(c == ']'  ){
               if(stack.peek()=='[')
                    stack.pop();

                    else return false;
                
            }
            
            }

        }

        if(stack.isEmpty()){

            return true;

        }

        return false;
        
    }
}
