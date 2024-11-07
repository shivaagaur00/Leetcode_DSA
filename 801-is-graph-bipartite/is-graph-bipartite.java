class Solution {
    public boolean isBipartite(int[][] graph) {
        int[]vis=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(vis[i]==0){
                if(!bfs(vis,graph,i)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int[]vis,int[][]arr,int idx){
        Queue<Integer> q=new LinkedList<>();
        int k=idx;
        vis[idx]=1;
        q.add(idx);
        while(!q.isEmpty()){
            idx=q.poll();
            for(int i=0;i<arr[idx].length;i++){
                if(vis[arr[idx][i]]==0) q.add(arr[idx][i]);
                if(vis[arr[idx][i]]==vis[idx]) return false;
                else if(vis[arr[idx][i]]==0 && vis[idx]==1){
                    vis[arr[idx][i]]=2;
                }
                else if(vis[arr[idx][i]]==0 && vis[idx]==2){
                    vis[arr[idx][i]]=1;
                }
            }
        }
        return true;
    }
}