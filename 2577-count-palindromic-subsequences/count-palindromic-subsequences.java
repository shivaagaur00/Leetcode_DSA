class Solution {
    int div = 1000000007;
    int n;
    int[][][][] dp;
    public int countPalindromes(String s) {
        n=s.length();
        dp=new int[n][11][11][6];
        return solve(0,10,10,0,s.toCharArray());
    }
    public int solve(int idx, int first, int second, int index, char[] arr) {
        if (idx==n) return index==5?1:0;
        if (dp[idx][first][second][index]!=0) return dp[idx][first][second][index];
        int notPick = solve(idx+1,first,second,index,arr)%div;
        int pick = 0;
        if (index==0)pick=solve(idx+1,arr[idx]-'0',second,index+1,arr);
        else if (index == 1) pick=solve(idx+1,first,arr[idx]-'0',index+1,arr);
        else if (index == 2) pick=solve(idx+1,first,second,index+1,arr);
        else if (index == 3) pick=arr[idx]-'0'==second?solve(idx+1,first,second,index+1,arr):0;
        else if (index == 4) pick=arr[idx]-'0'==first?solve(idx+1,first,second,index+1,arr):0;
        pick%=div;
        return dp[idx][first][second][index] = (pick + notPick) % div;
    }
}
