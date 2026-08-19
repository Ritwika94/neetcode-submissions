class Twitter {
    int count;
    HashMap<Integer,Set<Integer>> follwerMap;
    HashMap<Integer,List<int[]>> tweetMap;

    public Twitter() {
        count =0;
        follwerMap = new HashMap();
        tweetMap =new HashMap();
        
    }
    
    public void postTweet(int userId, int tweetId) {
         tweetMap.computeIfAbsent(userId,k->new ArrayList<>())
        .add(new int[]{count--,tweetId});
        
    }
    
    public List<Integer> getNewsFeed(int userId) {
          List<Integer> res = new ArrayList<>();
        PriorityQueue<int[]> minHeap=new PriorityQueue<int[]>(Comparator.comparingInt(
            a->a[0]));
        follwerMap.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);
        for(int follweeId: follwerMap.get(userId)){
               if (!tweetMap.containsKey(follweeId)) continue;
            List<int[]> list =tweetMap.get(follweeId);
            int index =list.size()-1;
            int[] curr=list.get(list.size()-1);
            minHeap.offer(new int[]{curr[0],curr[1],follweeId,index});
            }
        
        while (!minHeap.isEmpty() && res.size() < 10){
            int[]curr1 =minHeap.poll();
            res.add(curr1[1]);
            int index =curr1[3];
            if(index>0){
                int [] tweet= tweetMap.get(curr1[2]).get(index -1);
                minHeap.add(new int[]{tweet[0], tweet[1],curr1[2],index-1});
            }
        }

        return res;

        
    }
    
    public void follow(int followerId, int followeeId) {
        follwerMap.computeIfAbsent(followerId,k->new HashSet())
        .add(followeeId);


        
    }
    
    public void unfollow(int followerId, int followeeId) {

        if(follwerMap.containsKey(followerId)){
            Set<Integer> hset = follwerMap.get(followerId);
            hset.remove(followeeId);
            follwerMap.put(followerId,hset);
        }
        
    }
}
