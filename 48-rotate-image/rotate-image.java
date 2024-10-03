class Solution {
    public static void rotate(int[][] matrix) {
        int[][] xx=new int[matrix.length][matrix.length];
        for (int i=0;i<xx.length;i++){
            for(int j=0;j<matrix.length;j++){
                xx[i][j]=matrix[i][j];
            }
        }
            for(int i=0;i<matrix.length;i++){
                for(int j=0,s=matrix.length-1;j<matrix[i].length && s>-1;j++,s--){
                    matrix[i][j]=xx[s][i];
                }
            }
        }

}