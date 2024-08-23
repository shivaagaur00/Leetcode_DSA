class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans=0;
        int idx=0;
        for(int a:citations){
            if(a>=citations.length-idx) ans=Math.max(ans,citations.length-idx);
            idx++;
        }
        return ans;
    }
}