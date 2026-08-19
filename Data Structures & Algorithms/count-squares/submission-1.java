class CountSquares {
    Map<String,Integer>hmap;

    public CountSquares() {
        hmap=new HashMap<>();
        
    }
    
    public void add(int[] point) {
        int p0= point[0];
        int p1= point[1];
        String p = p0+","+p1;
        hmap.put(p,hmap.getOrDefault(p,0)+1);
        
    }
    
    public int count(int[] point) {
        int x =point[0];
        int y = point[1];
        int res =0;
        for(String key : hmap.keySet()){
            String arr[]=key.split(",");
            int x1 =Integer.parseInt(arr[0]);
            int y1 =Integer.parseInt(arr[1]);
            if(x==x1 && y1!=y){
                int d = y1-y;
                String p1 = (x+d)+","+y;
                 String p2 = (x+d)+","+y1;
                 if(hmap.containsKey(p1) && hmap.containsKey(p2)){
                    res+=hmap.get(key)*hmap.get(p1)*hmap.get(p2);
                 }
                 String p3 = (x-d)+","+y;
                 String p4 = (x-d)+","+y1;
                 if(hmap.containsKey(p3) && hmap.containsKey(p4)){
                    res+=hmap.get(key)*hmap.get(p3)*hmap.get(p4);
                 }
            }
        }

        return res;
        
    }
}
