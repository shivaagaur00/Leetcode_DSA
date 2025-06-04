class Solution {
    public int maxDistance(int[] n1, int[] n2) {
        int i=0;
        int j=0;
        int ans=0;
    while (i < n1.length && j < n2.length){
        if (n1[i] > n2[j]) ++i;
        else ans = Math.max(ans, j++ - i);
    }
    return ans;
}
}