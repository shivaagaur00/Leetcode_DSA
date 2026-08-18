class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0L;
        for(int i=nums.length-1;k>0;i--){
            if(mul>0){
                ans+=((long)nums[i]*mul);
                mul--;
            }
            else ans+=(nums[i]);
            k--;
        }
        return ans;
    }
}