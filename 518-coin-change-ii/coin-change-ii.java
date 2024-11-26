class Solution {
    public int change(int amount, int[] coins) {
        int [][]dp= new int[coins.length+1][amount+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        for(int c=1;c<dp.length;c++){
            for(int amt=1;amt<=amount;amt++){
                int inc =0;
                int exc=0;
                if(amt>=coins[c-1]){
                    inc= dp[c][amt-coins[c-1]];
                }
                exc = dp[c-1][amt];
                dp[c][amt]=exc+inc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}