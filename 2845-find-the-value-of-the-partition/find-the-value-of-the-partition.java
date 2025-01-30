class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int ans=nums[1]-nums[0];
        int n=nums.length;
        for(int i=2;i<n;i++){
            ans=Math.min(ans,nums[i]-nums[i-1]);
        }
        return ans;
    }
}