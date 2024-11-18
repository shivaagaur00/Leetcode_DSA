class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
        int i=2;
        while(i<n){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
            i++;
        }
        return dp[n-1];
    }
}