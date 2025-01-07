class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        return n-func(s);
    }
    public int func(String s){
        int n=s.length();
        StringBuilder st=new StringBuilder(s);
        st=st.reverse();
        int[][]dp=new int[n][n];
        for(int a[]:dp) Arrays.fill(a,-1);
        return longestCommonSubSequence(dp,n-1,n-1,s.toString(),st.toString());
    }
    public int longestCommonSubSequence(int[][]dp,int i,int j,String s1,String s2){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return 1+longestCommonSubSequence(dp,i-1,j-1,s1,s2);
        int first=longestCommonSubSequence(dp,i-1,j,s1,s2);
        int last=longestCommonSubSequence(dp,i,j-1,s1,s2);
        return dp[i][j]=Math.max(first,last);
    }

}