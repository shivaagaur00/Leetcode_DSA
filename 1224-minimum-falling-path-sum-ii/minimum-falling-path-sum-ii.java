class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<m;i++){
            dp[0][i]=arr[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int min=Integer.MAX_VALUE;
                for(int k=0;k<m;k++){
                    if(k!=j) min=Math.min(arr[i][j]+dp[i-1][k],min);
                }
                dp[i][j]=min;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }

}