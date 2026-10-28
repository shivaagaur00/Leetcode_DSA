class Solution {
    public String modifyString(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                char ch = 'a';

                while ((i > 0 && ch == ans.charAt(ans.length() - 1)) ||
                       (i < s.length() - 1 && ch == s.charAt(i + 1))) {
                    ch++;
                }

                ans += ch;
            } else {
                ans += s.charAt(i);
            }
        }

        return ans;
    }
}