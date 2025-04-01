class Solution {
    public int n;
    public Long[] f;
    public int[][] questions;
    public long mostPoints(int[][] questions) {
        n=questions.length;
        f=new Long[n];
        this.questions=questions;
        return dfs(0);
    }
    public long dfs(int i) {
        if (i>=n) {
            return 0;
        }
        if (f[i]!=null) {
            return f[i];
        }
        int p=questions[i][0];
        int b=questions[i][1];
        return f[i]=Math.max(p+dfs(i+b+1),dfs(i+1));
    }
}