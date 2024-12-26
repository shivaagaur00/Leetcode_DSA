class Solution {
    public int numberOfWays(int n, int x) {
        int[][] dp=new int[n+1][n+1];
        for(int[] a:dp) Arrays.fill(a,-1);
        return func(dp,n,1,x,n);
    }
    public int func(int[][] dp,int n,int num,int x,int sum){
        if(sum==0) return 1;
        if(sum<0 || num>n) return 0;
        if(dp[num][sum]!=-1) return dp[num][sum];
        int take=func(dp,n,num+1,x,(int)(sum-Math.pow(num,x)));
        int Nottake=func(dp,n,num+1,x,(int)(sum));
        return dp[num][sum]=(take+Nottake)% 1000000007;
    }
}