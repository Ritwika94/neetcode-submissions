class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();
        int result =0;
        for(int i = 0;i<tokens.length;i++){
            if(isDigit(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else{
                String op = tokens[i];
                
                int a = stack.pop(); // second operand
                int b = stack.pop();
                
                
               
                if (op.equals("+")) {
                    result = a + b;
                } else if (op.equals("-")) {
                    result = b-a;
                } else if (op.equals("*")) {
                     System.out.println("hi"+a+b);
                    result = a * b;
                } else if (op.equals("/")) {
                    result = b/a;
                }
                System.out.println(result);
                stack.push(result);

            }
        }
      return stack.pop();  
    }

    private boolean isDigit(String s) {
    return !(s.equals("+") || s.equals("-") || 
             s.equals("*") || s.equals("/"));
}
}
