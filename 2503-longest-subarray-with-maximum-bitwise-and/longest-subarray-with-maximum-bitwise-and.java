class Solution {
    public int longestSubarray(int[] nums) {
        int max=nums[0];
        for(int a:nums) max=Math.max(a,max);
        int ans=0;
        int count=0;
        for(int a:nums){
            if(a==max) count++;
            else{
                ans=Math.max(count,ans);
                count=0;
            }
        }
        ans=Math.max(count,ans);
        return ans;
    }
}