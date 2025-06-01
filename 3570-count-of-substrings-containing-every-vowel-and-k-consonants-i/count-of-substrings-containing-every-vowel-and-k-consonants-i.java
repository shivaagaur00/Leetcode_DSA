class Solution {
    public  int countOfSubstrings(String s, int k) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int a = 0, e = 0, i_count = 0, o = 0, u = 0, c = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == 'a') a++;
                else if (s.charAt(j) == 'e') e++;
                else if (s.charAt(j) == 'i') i_count++;
                else if (s.charAt(j) == 'o') o++;
                else if (s.charAt(j) == 'u') u++;
                else c++;

                if (a > 0 && e > 0 && i_count > 0 && o > 0 && u > 0 && c == k) {
                    ans++;
                }
            }
        }

        return ans;
    }
}