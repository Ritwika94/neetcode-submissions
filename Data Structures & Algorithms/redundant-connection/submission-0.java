class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        HashMap<Integer,List<Integer>> hmap=new HashMap<>();
        
        for(int[] a : edges){
        int[] visited = new int[edges.length + 1]; // reset every time

    if(dfs(a[0], a[1], hmap, visited)){
        return a;
    }

    hmap.computeIfAbsent(a[0], k-> new ArrayList<>()).add(a[1]);
    hmap.computeIfAbsent(a[1], k-> new ArrayList<>()).add(a[0]);
}
        return new int[]{};
        
    }

    public boolean dfs(int source,int target, HashMap<Integer,List<Integer>> hmap,int visited[] ){
        if(source == target) return true;
        visited[source]=1;
    if(hmap.containsKey(source)){
        for(int c : hmap.get(source)){
            if(visited[c]==0){
                if (dfs(c, target,hmap,visited)){
                    return true;
                }
            }
            
        }
        
    }
    return false;
}

}
