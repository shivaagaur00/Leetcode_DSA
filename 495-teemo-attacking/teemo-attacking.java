class Solution {
    public int findPoisonedDuration(int[] t, int duration) {

        int ans = 0;
        for (int i = 1; i < t.length; i++) {
            ans += Math.min(duration, t[i] - t[i - 1]);
        }

        return ans + duration;
    }
}