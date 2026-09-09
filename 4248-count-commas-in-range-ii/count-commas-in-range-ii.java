class Solution {
    public long countCommas(long n) {
        int[] arr = new int[17];
        for (int i = 1; i < 17; i++) {
            arr[i] = (i - 1) / 3;
        }
        long ans = 0;
        int digits = String.valueOf(n).length();

        for (int d = 4; d <= digits; d++) {
            long commas = arr[d];

            if (d < digits) {
                ans += 9L * (long)Math.pow(10, d - 1) * commas;
            } else {
                long start = (long)Math.pow(10, d - 1);
                ans += (n - start + 1) * commas;
            }
        }

        return ans;
    }
}