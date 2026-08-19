class KthLargest {
    PriorityQueue<Integer> q;
    int k ;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>(k);
        this.k =k; 
        for(int n :nums){
           addToHeap(n);
        }
        
    }

    private void addToHeap(int val) {
        q.add(val);
        if (q.size() > k) {
            q.poll(); 
        }
    }
    
    public int add(int val) {
        addToHeap(val);
    if (q.size() > k) {
            q.poll();
        }        return q.peek();
    }
}
