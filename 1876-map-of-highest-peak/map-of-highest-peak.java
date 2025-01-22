class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length;
        int m = isWater[0].length;
        int[][] ans= new int[n][m];
        for(int []i:ans) Arrays.fill(i,Integer.MAX_VALUE);
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    ans[i][j]=0;
                    q.add(new int[]{i,j});
                }
            }
        }
        int [][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int []p=q.poll();
            for(int []i:dir){
                int nr=i[0]+p[0];
                int nc=i[1]+p[1];
                if(nr>=0 && nc<m && nr<n && nc>=0 && ans[nr][nc]>1+ans[p[0]][p[1]]){
                    ans[nr][nc]=1+ans[p[0]][p[1]];
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return ans;

    }
}