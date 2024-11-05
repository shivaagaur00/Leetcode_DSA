class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,bfs(i,j,grid));
                }
            }
        }
        return max;
    }
    class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int bfs(int id,int j,int[][] grid){
        grid[id][j] = 2;
        int ans=0;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(id,j));
        int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        while(!q.isEmpty()){
            ans++;
            pair temp=q.poll();
            int r=temp.first;
            int c=temp.second;
            for (int[] i : direction) {
                    if (r + i[0] < grid.length && r + i[0] >= 0 && c + i[1] < grid[0].length && c + i[1] >= 0 && grid[r + i[0]][c + i[1]]==1 ) {
                        q.add(new pair(r+i[0],c+i[1]));
                        grid[r + i[0]][c + i[1]] = 2;
                }
            }
        }
        return ans;
    }
}