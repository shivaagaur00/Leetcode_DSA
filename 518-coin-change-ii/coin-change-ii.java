class Solution {
    public int change(int amount, int[] coins){
        int[][] dp=new int[coins.length][amount+1]; 
        for(int[] a:dp) Arrays.fill(a,-1);
        return func(coins,amount,0,dp);
    }
    public int func(int[] arr,int amount,int idx,int[][]dp){
        if(amount==0) return 1;
        if(amount<0) return 0;
        if(idx==arr.length) return 0;
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int res=0;
        for(int i=idx;i<arr.length;i++){
            res+=func(arr,amount-arr[i],i,dp);
        }
        return dp[idx][amount]=res;
    }
}