class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        boolean[] dp=new boolean[n];
        dp[0]=true;
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            if(!dp[i]) continue;
            start=Math.max(i+minJump,end+1);
            end=Math.min(i+maxJump,n-1);
            for(int j=start;j<=end;j++){
                if(s.charAt(j)=='0') dp[j]=true;
            }
            if(dp[n-1]) return true;
        }
        return dp[n-1];
    }
    // recursive approach
    // public boolean func(String s,int min,int max,int idx){
    //     if(idx>=s.length() || s.charAt(idx)!='0') return false;
    //     if(idx==(s.length()-1)) return true;
    //     for(int i=min;i<=max;i++){
    //         if(func(s,min,max,idx+i)) return true;
    //     }
    //     return false;
    // }
}