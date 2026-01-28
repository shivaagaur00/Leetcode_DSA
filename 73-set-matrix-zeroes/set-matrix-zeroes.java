class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> st=new HashSet<>();
        Set<Integer> stJ=new HashSet<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    st.add(i);
                    stJ.add(j);
                }
            }
        }
        for(int a:st){
            for(int i=0;i<m;i++){
                matrix[a][i]=0;
            }
        }
        for(int a:stJ){
            for(int i=0;i<n;i++){
                matrix[i][a]=0;
            }
        }
    }
}