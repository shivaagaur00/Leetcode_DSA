class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int x=source[0];
        int y=source[1];
        int a=target[0];
        int b=target[1];
        if(x==a&&y==b){
            return 0;
        }
        else if((x==a&&y!=b)||(x!=a&&y==b)){
            return 1;
        }
        else if((x+y)==(a+b)){
            return 1;
        }
        else if(Math.abs(x-a)==Math.abs(y-b)){
            return 1;
        }
        else{
            return 2;
        }
    }
}