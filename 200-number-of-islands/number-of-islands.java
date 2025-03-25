class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    bfs(visited,i,j,grid);
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
    public void bfs(boolean[][] vis,int i,int j,char[][]grid){
        int n=grid.length;
        int m=grid[0].length;
        vis[i][j]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int ii=temp.first;
            int jj=temp.second;
            for(int[] dir:dis){
                int newii=ii+dir[0];
                int newjj=jj+dir[1];
                if(newii<n && newjj<m && newii>=0 && newjj>=0 && grid[newii][newjj]=='1' && !vis[newii][newjj]){
                    q.add(new Pair(newii,newjj));
                    vis[newii][newjj]=true;
                }
            }
        }
    }
}