class Pair{
    int distance;
    int row;
    int col;
    Pair(int distance, int row, int col){
        this.distance=distance;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        int n=grid.length;
        int[][] dist=new int[n][n];
        Queue<Pair> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=0;
        q.add(new Pair(0, 0, 0));
        int x[]={0, 1, 1, 1, 0, -1, -1, -1};
        int y[]={1, 1, 0, -1, -1, -1, 0, 1};
        while(!q.isEmpty()){
            Pair node=q.remove();
            int distance=node.distance;
            int row=node.row;
            int col=node.col;
            if(row==n-1 && col==n-1){
                dist[row][col]++;
                break;
            }
            for(int i=0; i<8; i++){
                int nRow=row+x[i];
                int nCol=col+y[i];
                if(nRow>=0 && nRow<n && nCol>=0 && nCol<n && distance+1<dist[nRow][nCol] && grid[nRow][nCol]==0){
                    dist[nRow][nCol]=distance+1;
                    q.add(new Pair(distance+1, nRow, nCol));
                }
            }
        }
        return dist[n-1][n-1]==1e9?-1:dist[n-1][n-1];
    }
}