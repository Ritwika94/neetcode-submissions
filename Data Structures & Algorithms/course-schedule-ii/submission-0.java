class Solution {
    List<Integer> courselist = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> hmap = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            int x = prerequisites[i][0];
            int y = prerequisites[i][1];
            hmap.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
        }

        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!canFinishDFS(hmap, visited, i)) {
                return new int[]{}; // cycle detected
            }
        }

        // Convert list to array
        int[] arr = courselist.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    private boolean canFinishDFS(HashMap<Integer, List<Integer>> hmap, int[] visited, int i) {
        if (visited[i] == 1) return true;   // already processed
        if (visited[i] == -1) return false; // cycle detected

        visited[i] = -1; // mark as visiting

        for (int j : hmap.getOrDefault(i, new ArrayList<>())) {
            if (!canFinishDFS(hmap, visited, j)) {
                return false;
            }
        }

        visited[i] = 1; // mark as fully visited
        courselist.add(i); // add course after prerequisites
        return true;
    }
}