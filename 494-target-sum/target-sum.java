class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int offset=0;
        for(int a:nums) offset+=a;
        int[][] dp=new int[nums.length][2*offset+1];
        for(int[]a:dp) Arrays.fill(a,-1);
        return func(dp,nums,target,0,0,offset);
    }
    public int func(int[][]dp,int nums[],int target,int idx,int sum,int offset){
        if(idx==nums.length){
            if(target==sum) return 1;
            else return 0;
        }
        if(dp[idx][sum+offset]!=-1) return dp[idx][sum+offset];
        int left=func(dp,nums,target,idx+1,sum+nums[idx],offset);
        int right=func(dp,nums,target,idx+1,sum-nums[idx],offset);
        dp[idx][sum+offset]=left+right;
        return left+right;
    }
}