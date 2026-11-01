class Solution {
    List<Integer> courseList = new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
         
        int visited[]=new int[n];
        HashMap<Integer , ArrayList<Integer>> hmap =new HashMap();
        for(int i =0;i<prerequisites.length;i++){
            for(int j=0;j<prerequisites[0].length;j++){
                hmap.computeIfAbsent(prerequisites[i][0], k -> new ArrayList<>()).add(prerequisites[i][1]);
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(hmap, visited, i)) {
                return new int[]{}; // cycle detected
            }
        }
        for(int i =0;i<n;i++){
            dfs(hmap,visited,i);
        }

        int[] arr = courseList.stream().mapToInt(i -> i).toArray();
        return arr;
        
    }
    public boolean dfs(HashMap<Integer, ArrayList<Integer>> hmap, int[] visited, int i){
        if(visited[i]==1){
            return false;
        }
        if(visited[i]==-1){
            return true;
        }
        visited[i]=1;
        for(int k :hmap.getOrDefault(i, new ArrayList<>()) ){
            if(!dfs(hmap, visited, k)){
                    return false;
            }
         }
         visited[i]=-1;
            courseList.add(i);
            return true;
    }


}
