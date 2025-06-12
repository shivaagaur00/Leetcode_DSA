class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Math.abs(nums[0]-nums[nums.length-1]);
        int n=nums.length;
        for(int i=1;i<n;i++){
            max=Math.max(max,Math.abs(nums[i]-nums[i-1]));
        }
        return max;
    }
}