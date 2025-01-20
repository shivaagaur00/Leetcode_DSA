class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer,int[]> map=new HashMap<>();
        int m=mat.length;
        int n=mat[0].length;
        int[] row=new int[m];
        int[] col=new int[n];
        Arrays.fill(row,n);
        Arrays.fill(col,m);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        // for(int key:map.keySet()){
        //     System.out.println(key+" "+map.get(key)[0]+" "+map.get(key)[1]);
        // }
        int idx=0;
        for(int a:arr){
            int[] temp=map.get(a);
            row[temp[0]]--;
            col[temp[1]]--;
            if(row[temp[0]]==0 || col[temp[1]]==0) return idx;
            idx++;
        }
        return 0;
    }
}