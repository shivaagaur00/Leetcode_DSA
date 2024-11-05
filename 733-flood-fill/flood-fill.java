class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int start=image[sr][sc];
        bfs(start,sr,sc,color,image);
        return image;   
    }
    class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public void bfs(int start,int row,int col,int color,int[][] arr){
        arr[row][col]=color;
        Queue<pair> q=new LinkedList<>();
        boolean[][] visited=new boolean[arr.length][arr[0].length];
        q.add(new pair(row,col));
        while(!q.isEmpty()){
            pair temp=q.poll();
            int r=temp.first;
            int c=temp.second;
            int[][]direction={{0,1},{1,0},{0,-1},{-1,0}};
            for(int[] num:direction){
                if(r+num[0]<arr.length && r+num[0]>=0 && c+num[1]>=0 && c+num[1]<arr[0].length && arr[r+num[0]][c+num[1]]==start && !visited[r+num[0]][c+num[1]]){
                    q.add(new pair(r+num[0],c+num[1]));
                    visited[r+num[0]][c+num[1]]=true;
                    arr[r+num[0]][c+num[1]]=color;
                }
            }
        }
    }
}