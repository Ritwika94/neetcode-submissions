class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list =new ArrayList();
        Deque<Integer> dq= new LinkedList<>();
        for(int i =0;i<nums.length;i++){
            while(!dq.isEmpty() && i-k>=dq.peekFirst()){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])    {
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                list.add(nums[dq.peek()]);
            }
        }
  return list.stream().mapToInt(Integer::intValue).toArray();        
    }
}
