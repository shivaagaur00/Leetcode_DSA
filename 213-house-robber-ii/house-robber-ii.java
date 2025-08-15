class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)  return nums[0];
        else if(nums.length==2) return Math.max(nums[0],nums[1]);
        // int a=func(nums,0,nums.length-2);
        // int b=func(nums,1,nums.length-1);
        // System.out.println(a+" "+b);
        return Math.max(func(nums,0,nums.length-2),func(nums,1,nums.length-1));
    }
    public int func(int nums[],int i,int n){
        int dp[]=new int[nums.length];
        dp[i]=nums[i];
        dp[i+1]=Math.max(nums[i],nums[i+1]); 
        for(int id=i+2;id<=n;id++){
            dp[id]=Math.max(dp[id-1],nums[id]+dp[id-2]);
        }
        return dp[n];
    }
}