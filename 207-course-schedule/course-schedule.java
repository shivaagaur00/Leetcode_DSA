class Solution {
    public boolean canFinish(int n, int[][] arr) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            map.get(arr[i][0]).add(arr[i][1]);
        }
        int[] visited = new int[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                if (dfs(i, map, visited)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int course, Map<Integer, List<Integer>> graph, int[] visited) {
        visited[course] = 1; 
        for (int nextCourse : graph.get(course)) {
            if (visited[nextCourse] == 1) {
                return true; 
            }
            if (visited[nextCourse] == 0 && dfs(nextCourse, graph, visited)) {
                return true; 
            }
        }
        visited[course] = 2;
        return false;
    }
}
class pair{
    int a;
    int b;
    pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}