
class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int sum) {
        int n = nums.size();
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = -1;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums.get(i - 1) && dp[i - 1][j - nums.get(i - 1)] != -1)
                    dp[i][j] = Math.max(1 + dp[i - 1][j - nums.get(i - 1)], dp[i][j]);
            }
        }
        return dp[n][sum];
    }
}
