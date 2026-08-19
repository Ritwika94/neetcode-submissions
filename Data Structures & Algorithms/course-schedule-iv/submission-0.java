class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
         List<Set<Integer>> adj = new ArrayList<>();
        List<Set<Integer>> isPrereq = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj.add(new HashSet<>());
            isPrereq.add(new HashSet<>());
        }

        for(int[]preq : prerequisites){
            adj.get(preq[0]).add(preq[1]);
            indegree[preq[1]]++;

        }

        Queue<Integer> q =new LinkedList();
        for (int i = 0; i < numCourses; i++) {
            if(indegree[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int node =q.poll();
            for(int neighbor :adj.get(node)){
                isPrereq.get(neighbor).add(node);
                isPrereq.get(neighbor).addAll(isPrereq.get(node));
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) 
                q.offer(neighbor);
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int[]q1 : queries){
            res.add(isPrereq.get(q1[1]).contains(q1[0]));
        }

        return res;

    }
}