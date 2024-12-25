class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int offset=0;
        for(int a:nums) offset+=a;
        if (target>offset || target<(-offset)) return 0;
        int[][] dp=new int[nums.length][2*offset+1];
        for(int a[]:dp) Arrays.fill(a,-1);
        return func(dp,nums,0,0,target,offset);
    }
    public int func(int[][] dp,int[] nums,int idx,int sum,int target,int offset){
        if(idx==nums.length){
            if(target==sum) return 1;
            else return 0;
        }
        if(dp[idx][sum+offset]!=-1) return dp[idx][sum+offset];
        int take=func(dp,nums,idx+1,sum+nums[idx],target,offset);
        int left=func(dp,nums,idx+1,sum-nums[idx],target,offset);
        dp[idx][sum+offset]=take+left;
        return take+left;
    }
}