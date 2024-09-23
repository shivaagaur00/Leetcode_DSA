class Solution {
    public boolean isValidSudoku(char[][] board) {
        int id=0;
        while(id<9){
            int idx=0;
            while(idx<9){
                int[] arr=new int[9];
                for(int i=id;i<(id+3);i++){
                    for(int j=idx;j<(idx+3);j++){
                        if(board[i][j]!='.') arr[board[i][j]-'1']++;
                    }
                }
                for(int a:arr){
                    if(a>1) return false;
                }
                idx+=3;
            }
            id+=3;
        }
        for(int i=0;i<9;i++){
            int row[]=new int[9]; 
            int col[]=new int[9];
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && ++row[board[i][j]-'1']>1) return false;
                if(board[j][i]!='.' && ++col[board[j][i]-'1']>1) return false;
            }
        }
        return true;
    }
}