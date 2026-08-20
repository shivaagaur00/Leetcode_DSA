class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int temp[]=new int[heights.length];
        for(int i=0;i<n;i++){
            temp[i]=heights[i];
        }
        int ans=0;
        Arrays.sort(temp);
        for(int i=0;i<n;i++){
            if(temp[i]!=heights[i]) ans++;
        }
        return ans;
    }
}