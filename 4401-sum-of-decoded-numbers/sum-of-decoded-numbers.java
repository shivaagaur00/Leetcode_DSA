class Solution {
    static final long MOD = 1_000_000_007L;
    public int sumDecoded(long[] nums) {
        long ans = 0;
        for (long a : nums) {
            int w = (int)(a % 10);
            String temp = String.valueOf(a / 10);
            if (w < 0 || w > temp.length()) {
                continue;
            }
            String left = temp.substring(0, w);
            String right = temp.substring(w);
            long x = left.isEmpty() ? 0 : Long.parseLong(left);
            long y = right.isEmpty() ? 0 : Long.parseLong(right);
            ans = (ans + modPow(x, y, MOD)) % MOD;
        }
        return (int) ans;
    }
    private long modPow(long base, long exp, long mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
}