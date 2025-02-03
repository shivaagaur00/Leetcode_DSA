class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n=nums.length;
        Integer dp[]=new Integer[n+1];
        // Arrays.fill(dp,-1);
        return func(0,dp,nums,target,n);
    }
    public int func(int idx,Integer[] dp,int nums[],int tar,int n){
        if(idx==n-1) return 0;
        if(dp[idx]!=null) return dp[idx];
        int ans=-1;
        for(int i=idx+1;i<n;i++){
            if(Math.abs(nums[idx]-nums[i])<=tar){
                int currAns=func(i,dp,nums,tar,n);
                if(currAns!=-1) ans=Math.max(ans,1+currAns);
            }
        }
        return dp[idx]=ans;
    }
}