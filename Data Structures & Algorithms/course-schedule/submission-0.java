class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        HashMap<Integer,List<Integer>> hmap = new HashMap<Integer,List<Integer>>();
        for(int i =0;i< prerequisites.length;i++){
            
                int x = prerequisites[i][0];
                int y = prerequisites[i][1];
                hmap.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            
        }

        int visited[]=new int[numCourses];

       for(int i=0; i<numCourses; i++){
        if(!canFinishDFS(hmap, visited, i))
            return false;
    }
 
    return true;
        
    }
    public boolean canFinishDFS(HashMap<Integer,List<Integer>> hmap, int visited[],int i) {
        if(visited[i]==1)
        return true;

        if(visited[i]== -1)
            return false;
        visited[i]=-1;

        List<Integer> list =  hmap.get(i);

        if(list!=null){
            for(int j : list){
            if(!canFinishDFS(hmap,visited,j)){
                return false;
            }
        }
        }
       
        

        visited[i]=1;
        return true;
    }
}
