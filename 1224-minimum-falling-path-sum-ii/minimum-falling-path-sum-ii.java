class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        for(int i=0;i<m;i++){
            int a=func(dp,grid,n-1,i);
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            min=Math.min(min,dp[n-1][i]);
        }
        return min;
    }
    public int func(int[][] dp,int[][] arr,int i,int j){
        int n=dp.length;
        int m=dp[0].length;
        if(j<0 || j>=m) return Integer.MAX_VALUE;;
        if(i==0) {
            dp[i][j]=arr[i][j];
            return arr[i][j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=0;k<m;k++){
            if(k!=j) min=Math.min(min,func(dp,arr,i-1,k));
        }
        dp[i][j]=arr[i][j]+min;
        return dp[i][j];
    }
}