class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int cnt = 0;
        int[][] vis = new int[grid2.length][grid2[0].length];
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                if (grid1[i][j] == 1 && grid2[i][j] == 1 && vis[i][j] == 0) {
                    if (bfs(i, j, grid1, grid2, vis)) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    boolean bfs(int x, int y, int[][] grid1, int[][] grid2, int[][] vis) {
        vis[x][y] = 1;
        boolean ans = true;
        Queue<Pair> pq = new LinkedList<>();
        pq.add(new Pair(x, y));
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while (!pq.isEmpty()) {
            Pair p = pq.remove();
            int a = p.x;
            int b = p.y;
            for (int i = 0; i < 4; i++) {
                int nr = a + dr[i];
                int nc = b + dc[i];
                if (nr >= 0 && nc >= 0 && nr < grid1.length && nc < grid1[0].length && grid2[nr][nc] == 1 && vis[nr][nc] == 0) {
                    if (grid1[nr][nc] == 0) {
                        ans = false;
                    }
                    vis[nr][nc] = 1;
                    pq.add(new Pair(nr, nc));
                }
            }
        }
        return ans;
    }
}