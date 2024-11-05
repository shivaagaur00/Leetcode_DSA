class Solution {
    public int orangesRotting(int[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int ans = 0;
        Queue<pair> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j));
                    visited[i][j]=true;
                }
            }
        }
        int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        while(!q.isEmpty()){
            int n=q.size();
                boolean isrot=false;
            while(n-->0){
                pair temp=q.poll();
                int r = temp.first;
                int c = temp.second;
                for (int[] i : direction) {
                    if (r + i[0] < grid.length && r + i[0] >= 0 && c + i[1] < grid[0].length && c + i[1] >= 0 && !visited[r + i[0]][c + i[1]] && grid[r + i[0]][c + i[1]]!=0) {
                        q.add(new pair(r+i[0],c+i[1]));
                        visited[r + i[0]][c + i[1]] = true;
                        grid[r + i[0]][c + i[1]] = 2;
                        isrot=true;
                        System.out.println(r+i[0]+" "+(c+i[1]));
                } 
            }
        }
                if(isrot) ans++;
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