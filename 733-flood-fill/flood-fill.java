class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis=new boolean[image.length][image[0].length];
        dfs(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }
    int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public void dfs(int[][]image,int i,int j,int color,boolean[][] vis,int or){
        vis[i][j]=true;
        image[i][j]=color;
        for(int d[]:dir){
            int r=i+d[0];
            int c=j+d[1];
            if(r>=0 && c>=0 && r<image.length && c<image[0].length && !vis[r][c] && image[r][c]==or){
                dfs(image,r,c,color,vis,or);
            }
        }
    }
}