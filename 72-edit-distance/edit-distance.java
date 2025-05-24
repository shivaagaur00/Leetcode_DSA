class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n][m];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return func(n-1,m-1,word1,word2,dp);
    }
    public int func(int i,int j,String s1,String s2,int[][] dp){
        if(i==0 && j==0){
            if(s1.charAt(0)==s2.charAt(0)) return 0;
            return 1;
        }
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        int in=0;
        int re=0;
        int de=0;
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=func(i-1,j-1,s1,s2,dp);
        else{
            in =1+func(i,j-1,s1,s2,dp);
            de =1+func(i-1,j,s1,s2,dp);
            re =1+func(i-1,j-1,s1,s2,dp);
        }
        return dp[i][j] = Math.min(in, Math.min(re, de));

    }
}