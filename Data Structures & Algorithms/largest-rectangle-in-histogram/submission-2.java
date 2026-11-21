class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack=new Stack();
        int n=heights.length;
        int max =0;
        int start=0;
        for(int i=0;i<n;i++){
            start = i;
            while(!stack.isEmpty() && heights[i]<=stack.peek()[0]){
                int top[]=stack.pop();
                int height=top[0];
                int index =top[1];
                max = Math.max(max, height*(i-index));
                start=index;
            }
            stack.add(new int[]{heights[i],start});

        }

        while(!stack.isEmpty()){
         
            int[] top =stack.pop();
            max = Math.max(max,top[0]*(heights.length-top[1]));
            System.out.println(max);
        }

        return max;
    }

}
