class Solution {
    public int[][] sortMatrix(int[][] grid) {
        List<List<Integer>> temp=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            List<Integer> t=new ArrayList<>();
            int ii=i;
            int jj=0;
            while(ii<n && jj<m){
                t.add(grid[ii][jj]);
                ii++;
                jj++;
            }
            Collections.sort(t,Collections.reverseOrder());
            ii=i;
            jj=0;
            int id=0;
            while(ii<n && jj<m){
                grid[ii++][jj++]=t.get(id++);
            }
        }
        for(int i=1;i<m;i++){
            List<Integer> t=new ArrayList<>();
            int jj=i;
            int ii=0;
            while(ii<n && jj<m){
                t.add(grid[ii][jj]);
                ii++;
                jj++;
            }
            Collections.sort(t);
            ii=0;
            jj=i;
            int id=0;
            while(ii<n && jj<m){
                grid[ii++][jj++]=t.get(id++);
            }
        }
        return grid;
    }
}