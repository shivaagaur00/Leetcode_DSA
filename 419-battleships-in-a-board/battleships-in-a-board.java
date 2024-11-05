class Solution {
    public int countBattleships(char[][] board) {
        int ans=0;
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.' && !visited[i][j]){
                    bfs(board,visited,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }
    class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public void bfs(char[][] board,boolean vis[][],int i,int j){
        vis[i][j]=true;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(i,j));
        while(!q.isEmpty()){
            pair temp=q.poll();
            int r=temp.first;
            int c=temp.second;
        if(r+1<board.length && board[r+1][c]=='X'){
            q.add(new pair(r+1,c));
            vis[r+1][c]=true;
        }
        else if(c+1<board[0].length && board[r][c+1]=='X'){
            q.add(new pair(r,c+1));
            vis[r][c+1]=true;
        }
        }
    }
}