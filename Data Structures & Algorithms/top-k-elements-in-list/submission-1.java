class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hmap =new HashMap();
        for(int i =0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> b[1] - a[1]
        );
        for(Map.Entry<Integer, Integer> entry :hmap.entrySet()){
            int key =entry.getKey();
            int val = entry.getValue();
            pq.offer(new int[]{key,val});
        }
        int arr[]=new int[k];
        for(int i =0;i<k;i++){
            int a[]=pq.poll();
            arr[i]=a[0];
        }
        return arr;
        
    }
}
