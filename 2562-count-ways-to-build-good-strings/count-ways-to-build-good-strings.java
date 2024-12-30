class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        final int mod=1_000_000_007;
        int[] dp=new int[high+1];
        dp[0]=1;
        for(int i=1;i<=high;i++){
            long ans=0;
            if(i>=zero)ans+=dp[i-zero];
            if(i>=one)ans+=dp[i-one];
            dp[i]=(int)(ans%mod);
        }
        int result=0;
        for(int i=low;i<=high;i++){
        result=(result+dp[i])%mod;
        }
        return result;
    }
}
