class Solution {
    public int findKthLargest(int[] nums, int k) {

PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());        for(int i =0;i<nums.length;i++){
            heap.offer(nums[i]);
        }
        for(int i =0;i<k-1;i++){
            System.out.println(heap.poll());
        }

        return heap.peek();

    }
        
    
}
