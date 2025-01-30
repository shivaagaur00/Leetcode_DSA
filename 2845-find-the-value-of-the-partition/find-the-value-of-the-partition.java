class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=1;i<n;i++){
            ans=Math.min(ans,nums[i]-nums[i-1]);
        }
        return ans;
    }
}