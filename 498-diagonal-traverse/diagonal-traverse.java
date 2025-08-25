class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int k=n+m-1;
        boolean flag=true;
        int i=0,j=0;
        int ans[]=new int[n*m];
        int id=0;
        while(k-->0){
            if(flag){
                while(i>=0 && j>=0 && i<n && j<m){
                    ans[id++]=mat[i--][j++];     
                }
                if(j==m){
                    j=m-1;
                    i+=2;
                }
                else i=0;
            }
            else{
                while(i>=0 && j>=0 && i<n && j<m){
                    ans[id++]=mat[i++][j--];     
                }
                if(i==n){
                    j+=2;
                    i=n-1;
                }
                else j=0;
            }
            flag=!flag;
        }
        return ans; 
    }
}