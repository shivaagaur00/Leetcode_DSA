class Solution {
    public int numEnclaves(int[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            if(grid[i][0]==1) bfs(grid,i,0);
            if(grid[i][m-1]==1) bfs(grid,i,m-1);
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1) bfs(grid,0,i);
            if(grid[n-1][i]==1) bfs(grid,n-1,i);
        }
        for(int i[]:grid){
            for(int j:i){
                if(j==1) ans++;
            }
        }
        return ans;
    }
    int[][] directions={{1,0},{0,1},{0,-1},{-1,0}};
    public void bfs(int[][]grid,int i,int j){
        grid[i][j]=2;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(i,j));
        while(!q.isEmpty()){
            pair temp=q.poll();
            int row=temp.i;
            int col=temp.j;
            for(int[] dir:directions){
                int r=row+dir[0];
                int c=col+dir[1];
                if(r<grid.length && c<grid[0].length && c>=0 && r>=0 && grid[r][c]==1){
                    q.add(new pair(r,c));
                    grid[r][c]=2;
                }
            }
        }
    }
}
class pair{
    int i;
    int j;
    pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}