class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j));
                    vis[i][j]=true;
                }
            }
        }
        int ans=0;
        int[][] direction={ { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        while(!q.isEmpty()){
            int nn=q.size();
            boolean isRot=false;
            while(nn-->0){
                pair temp=q.poll();
                int r=temp.first;
                int c=temp.second;
                for(int[] i:direction){
                    int rr=r+i[0];
                    int cc=c+i[1];
                    if(rr>=0 && cc>=0 && rr<m && cc<n && !vis[rr][cc] && grid[rr][cc]!=0){
                        q.add(new pair(rr,cc));
                        vis[rr][cc]=true;
                        grid[rr][cc]=2;
                        isRot=true;
                    }
                }
            }
                if(isRot) ans++;
                else break;
        } 
         for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    return -1;
            }
        }
        return ans;
    }
}
class pair {
        int first;
        int second;

        pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }