class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=-1;
                }}}
        if(obstacleGrid[0][0]==-1) return 0;
        else obstacleGrid[0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(obstacleGrid[i][j]!=-1){
                if(i==0 && j>0 && obstacleGrid[i][j-1]!=-1){
                    obstacleGrid[i][j]=obstacleGrid[i][j-1];
                }
                else if(j==0 && i>0 && obstacleGrid[i-1][j]!=-1) obstacleGrid[i][j]=obstacleGrid[i-1][j];
                else{
                    if(j>0 && obstacleGrid[i][j-1]!=-1) obstacleGrid[i][j]=obstacleGrid[i][j-1];
                    if(i>0 && obstacleGrid[i-1][j]!=-1) obstacleGrid[i][j]+=obstacleGrid[i-1][j];
                }
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++) System.out.print(obstacleGrid[i][j]+" ");
        //     System.out.println();
        // }
        return obstacleGrid[n-1][m-1]!=-1?obstacleGrid[n-1][m-1]:0;   
    }
}