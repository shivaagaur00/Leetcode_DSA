class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    arr.get(j).add(i);
                    arr.get(i).add(j);
                }
            }
        }
        int ans=0;
        int[] vis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                ans++;
                dfs(vis,arr,i);
            }
        }
        return ans;
    }
    public void dfs(int[] vis,ArrayList<ArrayList<Integer>> arr,int i){
        vis[i]=1;
        for(int j=0;j<arr.get(i).size();j++){
            if(vis[arr.get(i).get(j)]==0){
                dfs(vis,arr,arr.get(i).get(j));
            }
        }
    }
}