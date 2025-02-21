class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i<(n-1) && mat[i+1][j]>mat[i][j]) || (j<(m-1) && mat[i][j+1]>mat[i][j]) || (i>0 && mat[i-1][j]>mat[i][j]) || (j>0 &&mat[i][j-1]>mat[i][j])){
                    continue;
                }
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}