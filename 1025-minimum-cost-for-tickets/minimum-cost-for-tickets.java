class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]=new int[days.length];
        return solve(0, days, costs,dp);
    }
    public int solve(int i, int[] days, int[] costs,int dp[]) {
        int n=days.length;
        if (i>=n) {
            return 0;
        }
        if(dp[i]!=0) return dp[i];

        int cost1=costs[0]+solve(i+1,days,costs,dp);
        int j=i;
        while (j<n && days[j]<days[i]+7) {
            j++;
        }
        int cost7=costs[1] + solve(j,days,costs,dp);
        j=i;
        while (j<n && days[j]<days[i]+30) {
            j++;
        }
        int cost30=costs[2]+solve(j,days,costs,dp);
        return dp[i]=Math.min(cost1, Math.min(cost7,cost30));
    }
}