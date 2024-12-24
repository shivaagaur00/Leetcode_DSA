class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<m;i++){
            dp[0][i]=arr[0][i];
        }
        for(int i=1;i<n;i++){
            dp[i][0]=arr[i][0];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int s=arr[i][j]+dp[i-1][j];
                int r=0;
                int l=0;
                if(j>0) l=arr[i][j]+dp[i-1][j-1];
                else l=Integer.MAX_VALUE;
                if(j<(m-1)) r=arr[i][j]+dp[i-1][j+1];
                else r=Integer.MAX_VALUE;
                dp[i][j]=Math.min(l,Math.min(r,s));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }

}