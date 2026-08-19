class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int []> stack =new Stack();
        int maxArea=0;
        int start =0;
        for(int i =0;i<heights.length;i++){
            start =i;
            while(!stack.isEmpty() && stack.peek()[1]>= heights[i]){
                int[] top = stack.pop();  // ✅ pop once
                int index = top[0];
                int height = top[1];
                maxArea = Math.max(maxArea, height*(i-index));
                start = index;
            }
            stack.add(new int[]{start,heights[i]});
        }
        while(!stack.isEmpty()){
            int[] top = stack.pop();  // ✅ pop once
            int index = top[0];
            int height = top[1];
            maxArea = Math.max(maxArea, height*(heights.length-index));


        }

        return maxArea;
        
    }
}
