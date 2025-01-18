class Solution {
    public int minCost(int[][] grid) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                return a[2]-b[2];
            }
        });
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        for(int a[]:vis){
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            int r=temp[0];
            int c=temp[1];
            int t=temp[2];
            if(r==m-1 && c==n-1) return t;
            for(int a[]:directions){
                int ri=r+a[0];
                int ci=c+a[1];
                int ti=0;
                if(ri>=0 && ci>=0 && ri<m && ci<n){
                    if(grid[r][c]==1 && a[0]==0 && a[1]==1) ti=t;
                    else if(grid[r][c]==2 && a[0]==0 && a[1]==-1) ti=t;
                    else if(grid[r][c]==4 && a[0]==-1 && a[1]==0) ti=t;
                    else if(grid[r][c]==3 && a[0]==1 && a[1]==0) ti=t;
                    else ti=t+1;
                    if(vis[ri][ci]>ti){
                        vis[ri][ci]=ti;
                        pq.add(new int[]{ri,ci,ti});
                    }
                }                
            }           
        }
        return -1;
    }
}