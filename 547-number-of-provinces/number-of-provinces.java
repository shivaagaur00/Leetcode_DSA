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
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(vis,i,conn);
                ans++;
            }
        }
        return ans;
    }
    public void dfs(boolean[] vis,int i,List<List<Integer>> conn){
        vis[i]=true;
        for(int j=0;j<conn.get(i).size();j++){
            if(!vis[conn.get(i).get(j)]) dfs(vis,conn.get(i).get(j),conn);
        }
    }
}