class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack();
        int maxArea=0;
        int start =0;

        for(int i =0;i<heights.length;i++){
            start =i;
            while(!stack.isEmpty() && stack.peek()[1]>=heights[i]) {
                int top[] = stack.pop();
                int ht = top[1];
                int index = top[0];
                maxArea = Math.max(maxArea, ht * (i-index));
                start =index;
            }
            stack.push(new int[]{start, heights[i]});
        }

        while(!stack.isEmpty()){
            int top[] = stack.pop();
                int ht = top[1];
                int index = top[0];
                maxArea = Math.max(maxArea, ht * (heights.length-index));
        }
        return maxArea;
    }

}
