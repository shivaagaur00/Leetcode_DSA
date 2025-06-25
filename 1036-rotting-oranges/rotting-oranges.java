class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j));
                    vis[i][j]=true;
                }
            }
        }
        int ans=0;
        int direction[][]={{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int nn=q.size();
            boolean isRot=false;
            while(nn-->0){
                pair temp=q.poll();
                int currI=temp.i;
                int currJ=temp.j;
                for(int[] a:direction){
                    int ci=currI+a[0];
                    int cj=currJ+a[1];
                    if(ci>=0 && cj>=0 && ci<m && cj<n && !vis[ci][cj] && grid[ci][cj]==1){
                        q.add(new pair(ci,cj));
                        vis[ci][cj]=true;
                        grid[ci][cj]=2;
                        isRot=true;
                    }
                }
            }
            if(isRot) ans++;
            else break;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1)
                    return -1;
            }
        }
        return ans;
    
    }
    class pair{
        int i;
        int j;
        pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
}