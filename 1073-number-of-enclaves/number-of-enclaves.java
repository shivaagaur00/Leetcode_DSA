class Solution {
    public int numEnclaves(int[][] grid) {
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(grid[i][0]==1) bfs(vis,grid,i,0);
            if(grid[i][m-1]==1) bfs(vis,grid,i,m-1);
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1) bfs(vis,grid,0,i);
            if(grid[n-1][i]==1) bfs(vis,grid,n-1,i);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) ans++;
            }
        }
        return ans;
    }
    class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
    public void bfs(boolean vis[][],int grid[][],int i,int j){
        grid[i][j]=2;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(i,j));
        int n=grid.length;
        int m=grid[0].length;
        while(!q.isEmpty()){
            pair temp=q.poll();
            int ii=temp.first;
            int jj=temp.second;
            for(int[] dis:dir){
                int newii=ii+dis[0];
                int newjj=jj+dis[1];
                if(newii>=0 && newjj>=0 && newii<n && newjj<m && grid[newii][newjj]==1){
                    q.add(new pair(newii,newjj));
                    grid[newii][newjj]=2;
                }
            }
        }
    }

}