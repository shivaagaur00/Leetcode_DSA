public class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (func(n) % t == 0) return n;
            n++;
        }
    }
    public int func(int num) {
        int ans = 1;
        while (num >0) {
            ans*= num%10;
            num/=10;
        }
        return ans;
    }
}
