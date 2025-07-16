class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1]; // +1 because prevIdx = -1 is mapped to n index
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return func(nums, 0, -1, dp);
    }
    
    public int func(int[] nums, int idx, int prevIdx, int[][] dp) {
        if (idx == nums.length) return 0;
        if (dp[idx][prevIdx + 1] != -1) return dp[idx][prevIdx + 1];

        int notTake = func(nums, idx + 1, prevIdx, dp);
        int take = 0;
        if (prevIdx == -1 || nums[idx] > nums[prevIdx]) {
            take = 1 + func(nums, idx + 1, idx, dp);
        }

        dp[idx][prevIdx + 1] = Math.max(take, notTake);
        return dp[idx][prevIdx + 1];
    }
}