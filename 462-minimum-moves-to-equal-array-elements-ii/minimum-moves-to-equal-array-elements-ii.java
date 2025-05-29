class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=nums[n/2];
        int ans=0;
        for(int a:nums){
            ans+=Math.abs(a-mid);
        }   
        return ans;
    }
}