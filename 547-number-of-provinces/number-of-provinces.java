class Solution {
    public int findCircleNum(int[][] isConnected) {
       int n=isConnected.length;
       List<List<Integer>> conn=new ArrayList<>();
       for(int i=0;i<n;i++){
        conn.add(new ArrayList<>());
       } 
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(isConnected[i][j]==1){
                conn.get(i).add(j);
                conn.get(j).add(i);
            }
        }
       }
       int ans=0;

       boolean[] vis=new boolean[n];
       Arrays.fill(vis,false);
       for(int i=0;i<n;i++){
        if(!vis[i]){
            ans++;
            dfs(conn,i,vis);
        }
       }
       return ans;
    }
    public void dfs(List<List<Integer>> conn,int id,boolean vis[]){
        vis[id]=true;
        for(int i=0;i<conn.get(id).size();i++){
            if(!vis[conn.get(id).get(i)]){
                dfs(conn,conn.get(id).get(i),vis);
            }
        }
        return;
    }
}