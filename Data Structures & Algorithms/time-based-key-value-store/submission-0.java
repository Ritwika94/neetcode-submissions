class TimeMap {
    static class Pair {
        int timestamp;
        String value;

        Pair(int t, String v) {
            this.timestamp = t;
            this.value = v;
        }
    }
    Map<String, ArrayList<Pair>> hmap;

    public TimeMap() {
        hmap=new HashMap();

        
    }
    
    public void set(String key, String value, int timestamp) {
        hmap.put(key, hmap.getOrDefault(key, new ArrayList<>()));
        hmap.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!hmap.containsKey(key)){
            return "";
        }
        ArrayList<Pair> list=hmap.get(key);
        int left =0;
        int right=list.size()-1;
        String result = "";
        while(left<=right){
            int mid = left +(right -left) /2;
            if(list.get(mid).timestamp<=timestamp){
                result =list.get(mid).value;
                left = mid +1;
            }
            else
            right = mid-1;
        }
        return result;
        
    }
}
