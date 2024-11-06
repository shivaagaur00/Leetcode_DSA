class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<n;i++){
            if (!visited[i][0] && board[i][0] == 'O') bfs(visited, board, i,0);
            if(!visited[i][m-1] && board[i][m-1]=='O') bfs(visited,board,i,m-1);
        }
        for(int i=0;i<m;i++){
            if (!visited[0][i] && board[0][i] == 'O') bfs(visited, board, 0, i);
            if(!visited[n-1][i] && board[n-1][i]=='O') bfs(visited,board,n-1,i);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='z') board[i][j]='O';
                else board[i][j]='X';
            }
        }
    }
    int[][] direction={{0,1},{0,-1},{-1,0},{1,0}};
    public void bfs(boolean[][] visited,char[][] board,int row,int col){
        board[row][col]='z';
        visited[row][col]=true;
        int n=board.length;
        int m=board[0].length;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(row,col));
        while(!q.isEmpty()){
            pair temp=q.poll();
            int r=temp.a;
            int c=temp.b;
            for(int[] ar:direction){
                int i=r+ar[0];
                int j=c+ar[1];
                if(i<n && i>=0 && j<m && j>=0 && !visited[i][j] && board[i][j]=='O'){
                    visited[i][j]=true;
                    board[i][j]='z';
                    q.add(new pair(i,j));
                }
            }
        }
    }
}
class pair{
    int a,b;
    pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}