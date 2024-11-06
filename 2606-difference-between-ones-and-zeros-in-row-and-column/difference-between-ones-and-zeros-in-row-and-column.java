class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] ROW_ARR=new int[grid.length];
        int[] COL_ARR=new int[grid[0].length];
        int[][] ans=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            ROW_ARR[i]=zero(i,grid);
        }
        for(int j=0;j<grid[0].length;j++){
            COL_ARR[j]=one(j,grid);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=ROW_ARR[i]+COL_ARR[j];
            }
        }
        return ans;      
        }
        public int zero(int i,int[][] grid){
        int row_zero=0,row_one=0;
            for(int k=0;k<grid[0].length;k++){
            if(grid[i][k]==0){
                row_zero++;
            }
            else{
                row_one++;
            }
        }
        return row_one-row_zero;
        }
        public int one(int j,int[][] grid){
        int col_zero=0,col_one=0;
            for(int k=0;k<grid.length;k++){
            if(grid[k][j]==0){
                col_zero++;
            }
            else{
                col_one++;
            }
        }
        return col_one-col_zero;
        }
    }

