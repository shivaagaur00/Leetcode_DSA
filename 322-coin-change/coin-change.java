class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] ans=new int[amount+1];
        Arrays.fill(ans,amount+1);
        ans[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<n;j++){
                if(coins[j]<=i) ans[i]=Math.min(ans[i],ans[i-coins[j]]+1);
            }
        }
        return ans[amount]==amount+1?-1:ans[amount];
    }
}