class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int row=n;
        int col=m;
        if(row==1 && col==1) return 1;
        int dp[][]=new int[n][m];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dp[i][j]==0){
                    max=Math.max(dfs(dp,i,j,matrix),max);
                }
            }
        }
        return max;
    }
    int direction[][]={{0,1},{1,0},{-1,0},{0,-1}};
    public int dfs(int[][]dp,int row,int col,int[][] arr){
        if(dp[row][col]>0) return dp[row][col];
        int ans=1;
        for(int[] dir:direction){
            int i=dir[0]+row;
            int j=dir[1]+col;
            if(i<0 || j<0 || j>=arr[0].length || i>=arr.length) continue;
            if(arr[i][j]<=arr[row][col]) continue;
            ans=Math.max(ans,dfs(dp,i,j,arr)+1);
        }
        dp[row][col]=ans;
        return ans;
    }
}