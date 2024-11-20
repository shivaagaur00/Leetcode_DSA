class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int[][]dp=new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++) Arrays.fill(dp[i],-1);
        return func(s1,s2,0,0,dp);
    }
    public int func(String s1,String s2,int i,int j,int[][]dp){
        if(s1.length()==i||s2.length()==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+func(s1,s2,i+1,j+1,dp);
        }
        else{
            int a=func(s1,s2,i+1,j,dp);
            int b=func(s1,s2,i,j+1,dp);
            ans=Math.max(a,b);
        }
        dp[i][j]=ans;
        return ans;
    }
}