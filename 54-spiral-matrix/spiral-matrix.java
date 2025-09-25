class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return ans;
        }
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        funct(top,bottom,left,right,ans,matrix);
        return ans;
    }
    public void funct(int top,int bottom,int left,int right,List<Integer> ans,int[][] arr){
        if (top > bottom || left > right) return;
        for(int i=left;i<=right;i++){
            ans.add(arr[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            ans.add(arr[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            ans.add(arr[bottom][i]);
        }
        }
        bottom--;
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            ans.add(arr[i][left]);
        }
        }
        left++;
        funct(top,bottom,left,right,ans,arr);
    }
}