class Solution {
    public int countServers(int[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        int rowFlag[]=new int[n];
        int colFlag[]=new int[m];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) count++;
            }
            rowFlag[i]=count;
        }
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]==1) count++;
            }
            colFlag[i]=count;
        }  
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && ((rowFlag[i]>1) || colFlag[j]>1)){
                    ans++;
                }
            }
        }
        return ans;
    }
}