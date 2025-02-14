class Solution {
    public int reverse(int x) {
        long ans=0;
        boolean flag=true;
        if(x>0) flag=false;
        if(flag) x*=-1;
        while(x>0){
            ans=ans*10+(x%10);
            x/=10;
        }
        if (ans>Integer.MAX_VALUE||ans<Integer.MIN_VALUE) {
            return 0;
        }
        if(flag) ans=ans*-1;
        return (int)ans;
    }
}