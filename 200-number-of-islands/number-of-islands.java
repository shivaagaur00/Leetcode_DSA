class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(visited,i,j,grid);
                    ans++;
                }
            }
        }
        return ans;
    }
    class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    int[][]dis={{0,1},{1,0},{-1,0},{0,-1}};
    public void dfs(boolean[][] vis,int i,int j,char[][]grid){
        int n=grid.length;
        int m=grid[0].length;
        if(vis[i][j]) return;
        vis[i][j]=true;
        for(int[] dir:dis){
            int newii=i+dir[0];
            int newjj=j+dir[1];
            if(newii<n && newjj<m && newii>=0 && newjj>=0 && grid[newii][newjj]=='1' && !vis[newii][newjj]){
                dfs(vis,newii,newjj,grid);
            }
        }
    }
}