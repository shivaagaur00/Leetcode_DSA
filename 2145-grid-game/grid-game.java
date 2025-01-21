class Solution {
    public long gridGame(int[][] grid) {
        long ans=Long.MAX_VALUE;
        long row1=0;
        int n=grid[0].length;
        for (int i=0;i<n;i++) {
            row1+=grid[0][i];
        }
        long row2=0;
        for (int i=0;i<n;i++) {
            row1-=grid[0][i];
            ans=Math.min(ans,Math.max(row1,row2));
            row2+=grid[1][i];
        }
        return ans;
    }
}
