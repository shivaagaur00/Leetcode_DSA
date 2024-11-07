class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(grid[i][0]==1) ans++;
            if(grid[i][m-1]==1) ans++;
            
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1) ans++;
            if(grid[n-1][i]==1) ans++;
        }
        System.out.println(ans);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(i+1<n && grid[i+1][j]==0) ans++;
                    if(i-1>=0 && grid[i-1][j]==0) ans++;
                    if(j+1<m && grid[i][j+1]==0) ans++;
                    if(j-1>=0 && grid[i][j-1]==0) ans++;   
                }
            }
        }
        return ans;

    }
}