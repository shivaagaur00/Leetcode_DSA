class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans=0;
        int n=dominoes.length;
        for(int i=0;i<n;i++){
            int a=dominoes[i][0];
            int b=dominoes[i][1];
            for(int j=i+1;j<n;j++){
                int aa=dominoes[j][0];
                int bb=dominoes[j][1];
                if((a==aa && b==bb) || (a==bb && b==aa)){
                    ans++;
                }
            }
        }
        return ans;
    }
}