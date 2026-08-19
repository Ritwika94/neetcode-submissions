class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int count =0;
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int []edge : edges){
            adj.get(edge[0]).add(edge[1]);
             adj.get(edge[1]).add(edge[0]);
        }
        Set<Integer> visit = new HashSet<>();
          for (int i = 0; i < n; i++){
            if(!visit.contains(i)){
            dfs(i,visit,adj);
            
                count ++;
                
            }
            
       
        }
        
       return count;
    }

       private void dfs(int node,  Set<Integer> visit,List<List<Integer>> adj){
                if (visit.contains(node)) return;
                visit.add(node);
                for(int n : adj.get(node)){
                    
                    dfs(n,visit,adj);
                     
                }

               
            }
        

}
    

