class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> alist=new ArrayList();
        Deque<Integer> q =new LinkedList();
        for(int i =0;i<nums.length;i++){
            while(!q.isEmpty() && q.peek()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && nums[i]>=nums[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
            if(i>=k-1){
                alist.add(nums[q.peek()]);
            }
            
        
        }

        int arr[]=alist.stream().mapToInt(j->j).toArray();
            return arr;

        
    }
}
