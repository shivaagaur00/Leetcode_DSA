class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k)
            return false;
        int[] count = new int[26];
        for (int i : s.toCharArray()) {
            count[i - 'a']++;
        }
        int odd = 0;
        for (int a : count) {
            if (a % 2 != 0) {
                odd++;
            }
        }
        if (odd > k)
            return false;
        return true;
    }
}