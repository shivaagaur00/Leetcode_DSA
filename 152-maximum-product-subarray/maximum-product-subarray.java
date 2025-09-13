class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int a:nums){
            ans=Math.max(ans,a);
        }
        int currMax=1,currMin=1;
        for(int n:nums){
            int temp=currMax*n;
            currMax=Math.max(temp,Math.max(currMin*n,n));
            currMin=Math.min(temp,Math.min(currMin*n,n));
            ans=Math.max(ans,currMax);   
        }
        return ans;
    }
}