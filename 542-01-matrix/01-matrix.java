class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int dist[][]=new int[n][m];
        boolean [][] vis=new boolean[n][m];
        Queue<trip> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                q.add(new trip(i,j,0));
                vis[i][j]=true;
                }
            }
        }
        int[][] direction={{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            trip temp=q.poll();
            int step=temp.c;
            int row=temp.a;
            int col=temp.b;
            dist[row][col]=step;
            for(int[] i:direction){
                int r=row+i[0];
                int c=col+i[1];
                if(r>=0 && r<n && c>=0 && c<m && !vis[r][c]){
                    vis[r][c]=true;
                    q.add(new trip(r,c,step+1));
                }
            }
        }
        return dist;
    }
}
class trip{
        int a;
        int b;
        int c;
        trip(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }