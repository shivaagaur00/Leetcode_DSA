class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return func(nums,0,0,target);
    }
    public int func(int[] nums,int idx,int sum,int target){
        if(idx==nums.length){
            if(target==sum) return 1;
            else return 0;
        }
        int take=func(nums,idx+1,sum+nums[idx],target);
        int left=func(nums,idx+1,sum-nums[idx],target);
        return take+left;
    }
    
}