class Solution {
    public int candy(int[] ratings) {
        int ans = 0;
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1])
                left[i] = ++curr;
            else {
                curr = 1;
                left[i] = 1;
            }
        }
        curr = 1;
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                right[i] = ++curr;
            else {
                curr = 1;
                right[i] = 1;
                ;
            }
        }
        for (int i = 0; i < n; i++) {
            ans += (Math.max(left[i], right[i]));
        }
        return ans;
    }
}