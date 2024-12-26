class Solution {
    public boolean canPartition(int[] arr) {
        int k=0;
        int n=arr.length;
        for(int a:arr){
            k+=a;
        }
        if(k%2!=0) return false;
        k/=2;
        boolean[][] dp=new boolean[arr.length][k+1];
      if (arr[0]<=k)dp[0][arr[0]] =true;
        for (int i=1;i<n;i++) {
            for (int j=1;j<=k;j++) {
                boolean notTaken=dp[i-1][j];
                boolean taken=false;
                if (arr[i]<=j) {
                    taken=dp[i-1][j-arr[i]];
                }
                dp[i][j]=notTaken||taken;
            }
        }
        return dp[n-1][k];
    }
}