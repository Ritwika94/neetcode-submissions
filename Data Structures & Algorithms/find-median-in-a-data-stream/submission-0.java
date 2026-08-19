class MedianFinder {
    PriorityQueue<Integer> p;
    PriorityQueue<Integer> q;

    public MedianFinder() {


         p = new PriorityQueue<Integer>();
         q = new PriorityQueue<Integer>(Collections.reverseOrder());
        
    }
    
    public void addNum(int num) {
        p.add(num);
        q.add(p.poll());
        if(p.size()< q.size()){
            p.add(q.poll());
        }
        
    }
    
    public double findMedian() {
        if((p.size() + q.size()) %2 != 0){
            return p.peek();
        }
        else{
            return(p.peek() +q.peek())/2.0;
        }
        
    }
}
