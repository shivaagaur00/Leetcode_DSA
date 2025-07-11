class pair{
    int d;
    int r;
    int c;
    pair(int r,int c,int d){
        this.r=r;
        this.c=c;
        this.d=d;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        int rg[]={0,0,-1,1,-1,-1,1,1};
        int cg[]={-1,1,0,0,-1,1,-1,1};
        int m=grid.length;
        int n=grid[0].length;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(0,0,0));
        int arr[][]=new int[m][n];
        for(int a[]:arr) Arrays.fill(a,Integer.MAX_VALUE);
        arr[0][0]=0;
        while(!q.isEmpty()){
            pair t=q.poll();
            int r=t.r;
            int c=t.c;
            int d=t.d;
            if(r==m-1 && c==n-1){
                arr[r][c]++;
                break;
            }
            for(int i=0;i<8;i++){
                int nr=rg[i]+r;
                int nc=cg[i]+c;
                if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==0 && d+1<arr[nr][nc]){
                    arr[nr][nc]=d+1;
                    q.add(new pair(nr,nc,d+1));
                    // System.out.println(nr+" "+nc);
                }
            }
        }
        return arr[m-1][n-1]==Integer.MAX_VALUE?-1:arr[m-1][n-1];
        
    }
}