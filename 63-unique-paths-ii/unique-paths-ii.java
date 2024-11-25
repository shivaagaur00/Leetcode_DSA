class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        if(arr[0][0]==1) return 0;
        arr[0][0]=1;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=1;i<n;i++){
            if(arr[i][0]==1){
                while(i<n){
                    arr[i++][0]=0;
                }
            }
            else arr[i][0]=1;
        }
        for(int i=1;i<m;i++){
            if(arr[0][i]==1){
                while(i<m){
                    arr[0][i++]=0;
                }
            }
            else arr[0][i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]==1) arr[i][j]=0;
                else arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[n-1][m-1];
    }
}