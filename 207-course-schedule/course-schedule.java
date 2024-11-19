class Solution {
    public boolean canFinish(int n, int[][] p) {
        int indeg[] = new int[n];
        List<List<Integer>> graph = new ArrayList<>();
         
        for (int i=0; i<n; i++) graph.add(new ArrayList<>());
        
        for (int el[] : p) {
            int a = el[0];
            int b = el[1];
            graph.get(b).add(a);
            indeg[a]++;
        }
        
        return topSort(graph, indeg); 
    }

    private boolean topSort(List<List<Integer>> graph, int indeg[]) {
        Queue<Integer> q = new LinkedList<>();
        int index = 0;
        
        for (int i=0; i<indeg.length; i++) {
            if (indeg[i] == 0) q.add(i);
        }
    
        while (!q.isEmpty()) {
            int curr = q.poll();
            index++;
            
            for (int neighbor : graph.get(curr)) {
                indeg[neighbor]--;
                if (indeg[neighbor] == 0) q.add(neighbor);
            }
        }
        
        return index == indeg.length;
    }
}