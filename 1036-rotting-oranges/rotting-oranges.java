class Solution {
    public int orangesRotting(int[][] grid) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        int m=grid.length;
        int n=grid[0].length;
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2) q.add(new pair(i,j));
            }
        }
        int ans=0;
        while(!q.isEmpty()){
            int t=q.size();
            boolean isRot=false;
            // ans++;
            while(t-->0){
                pair temp=q.poll();
                int ii=temp.i;
                int jj=temp.j;
                for(int a[]:dir){
                    int ni=ii+a[0];
                    int nj=jj+a[1];
                    if(ni>=0 && nj>=0 && ni<m && nj<n && grid[ni][nj]==1){
                        q.add(new pair(ni,nj));
                        grid[ni][nj]=2;
                        isRot=true;
                    }
                }
            }
            if(isRot) ans++;
            else break;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) return -1;
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