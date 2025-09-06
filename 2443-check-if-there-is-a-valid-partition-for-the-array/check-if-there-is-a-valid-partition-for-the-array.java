class Solution {
    public boolean validPartition(int[] nums) {
        int dp[]=new int[nums.length];
        return func(0,nums,dp);
    }
    public boolean func(int i,int[] nums,int[] dp){
        int n=nums.length;
        if(i==n) return true;
        if(dp[i]!=0){
            if(dp[i]==-1) return false;
            return true;
        }
        if((n-i)<2) return false;
        boolean two=false;
        if(nums[i]==nums[i+1]){
            two=func(i+2,nums,dp);
        }
        boolean three=false;
        if((n-i)>2){
            boolean flag=false;
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
                flag=true;
            }
            if((nums[i+1]-nums[i])==1 && (nums[i+2]-nums[i+1])==1){
                flag=true;
            }
            if(flag) three=func(i+3,nums,dp);
        }
        if(two||three){
            dp[i]=1;
        }
        else{
            dp[i]=-1;
        }
        return two||three;
    }
}