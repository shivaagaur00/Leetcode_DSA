class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return func(nums,target,0,0);
    }
    public int func(int nums[],int target,int idx,int sum){
        if(idx==nums.length){
            if(target==sum) return 1;
            else return 0;
        }
        int left=func(nums,target,idx+1,sum+nums[idx]);
        int right=func(nums,target,idx+1,sum-nums[idx]);
        return left+right;
    }
}