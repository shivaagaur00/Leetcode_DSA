class Solution {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            map.put(i,new HashSet<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    map.get(i).add(j);
                }
            }
        }
        // System.out.println(map);
    
        int count=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
                if(!vis[i]){
                    dfs(i,map,vis);
                    count++;
            }
        }
        return count;
    }
    public void dfs(int i,Map<Integer,Set<Integer>> map, boolean[] vis){
        vis[i]=true;
        for(int a:map.get(i)){
            if(!vis[a]) dfs(a,map,vis);
        }
    }
}