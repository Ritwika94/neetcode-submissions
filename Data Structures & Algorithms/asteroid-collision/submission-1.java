class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n =asteroids.length;

        Stack<Integer> stack =new Stack();
        for(int a : asteroids){
            while(!stack.isEmpty() && a<0 && stack.peek()>0){
                int diff = stack.peek()+a;
                if(diff<0){
                    stack.pop();
                }
                if(diff==0){
                    a=0;
                    stack.pop();
                }
                if(diff>0){
                    a=0;
                }
            }
            if (a != 0) {
                stack.add(a);
            }
        }
    return stack.stream().mapToInt(i -> i).toArray();

        
    }
}