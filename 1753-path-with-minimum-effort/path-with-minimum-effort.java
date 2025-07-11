class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int dist[][]=new int[m][n];
        for(int a[]:dist) Arrays.fill(a,Integer.MAX_VALUE);
        PriorityQueue<pair> pq=new PriorityQueue<>(new Comparator<pair>(){
            public int compare(pair a, pair b){
                return a.d-b.d ;
            }
        });
        
        int []rg= {-1, 0, 1, 0};
        int []cg = {0, 1, 0, -1};
        dist[0][0]=0;
        pq.add(new pair(0,0,0));
        while(!pq.isEmpty()){
            pair t=pq.poll();
            int r=t.r;
            int c=t.c;
            int d=t.d;
            if(r==m-1 && c==n-1) return d;
            for(int i=0;i<4;i++){
                int nr=rg[i]+r;
                int nc=cg[i]+c;
                if(nr<m && nc<n && nr>=0 && nc>=0){
                    int newEffort=Math.max(Math.abs(heights[nr][nc]-heights[r][c]),d);
                    if(newEffort<dist[nr][nc]){
                        pq.add(new pair(nr,nc,newEffort));
                        dist[nr][nc]=newEffort;
                    }
                }
            }
        }
        return 0;
    }
}
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