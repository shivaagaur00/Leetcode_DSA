class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[]a,int[]b){
                return a[0]-b[0];
            }
        });
        int directions[][]={{0,1},{1,0},{0,-1},{-1,0}};
        pq.add(new int[]{grid[0][0],0,0});
        vis[0][0]=true;
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            int t=temp[0];
            int x=temp[1];
            int y=temp[2];
            if(x==n-1 && y==m-1) return t;
            for(int d[]:directions){
                int i=d[0]+x;
                int j=d[1]+y;
                if(i<n && j<m && j>=0 && i>=0 && !vis[i][j]){
                    pq.add(new int[]{Math.max(t,grid[i][j]),i,j});
                    vis[i][j]=true;
                }
            }
        }
        return -1;

    }
}