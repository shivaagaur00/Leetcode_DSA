class Solution {
    public int numIslands(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1' && !visited[i][j]) {
                    ans++;
                    bfs(i, j, visited, grid);
                }
            }
        }
        return ans;
    }

    class pair {
        int first;
        int second;

        pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public void bfs(int row, int col, boolean[][] vis, char[][] grid) {
        vis[row][col]=true;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(row, col));
        while (!q.isEmpty()) {
            pair temp = q.poll();
            row = temp.first;
            col = temp.second;
            if(col+1<grid[0].length && grid[row][col+1]=='1' && !vis[row][col+1]){
                vis[row][col+1]=true;
                q.add(new pair(row,col+1));
            }
            if(col-1>=0  && grid[row][col-1]=='1' && !vis[row][col-1]){
                vis[row][col-1]=true;
                q.add(new pair(row,col-1));
            }
            if(row+1<grid.length && grid[row+1][col]=='1' && !vis[row+1][col]){
                vis[row+1][col]=true;
                q.add(new pair(row+1,col));
            }
            if(row-1>=0  && grid[row-1][col]=='1' && !vis[row-1][col]){
                vis[row-1][col]=true;
                q.add(new pair(row-1,col));
            }
        }
    }
}