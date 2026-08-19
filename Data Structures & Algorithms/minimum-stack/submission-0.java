class MinStack {
    Stack<Long> stack;
 long minimum=Long. MAX_VALUE;

    public MinStack() {
      stack = new Stack<Long>();
      while(!stack.isEmpty() ){
        stack.pop();
      } 
    }
    
    public void push(int val) {
        long val1=Long.valueOf(val);
        if(stack.isEmpty()){
            minimum=val1;
            stack.push(val1);
        }
        else{
            if(val1<minimum){
                stack.push(2*val1*1L-minimum);
                minimum =val1;
            }
            else{
                stack.push(val1);
            }
        }
        
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        else{
            long val =stack.pop();
            if(val<minimum){
                minimum = 2*minimum-val;
            }
        }
        
    }
    
    public int top() {
         if(stack.isEmpty())
            return -1;
        long val =stack.peek();
        if(val<minimum){
            return (int)minimum;
        }
        return (int) val;

        
    }
    
    public int getMin() {
       return (int)minimum; 
    }
}
