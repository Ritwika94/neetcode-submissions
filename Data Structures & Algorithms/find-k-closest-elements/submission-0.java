class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
);        
    for(int n : arr){
            pq.offer(new int[]{Math.abs(n-x), n});
        }
        ArrayList<Integer> list =new ArrayList();
        int i =0;
        while(!pq.isEmpty() && i<k){
            list.add(pq.poll()[1]);
            i++;
        }
        Collections.sort(list);
        return list ;
    }
}