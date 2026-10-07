class Solution {

    Set<String> ans = new HashSet<>();
    int maxLen = 0;

    public List<String> removeInvalidParentheses(String s) {
        generate(s, 0, new StringBuilder(), 0);
        return new ArrayList<>(ans);
    }

    void generate(String s, int idx, StringBuilder curr, int bal) {

        if (bal < 0) return;

        if (curr.length() + (s.length() - idx) < maxLen)
            return;

        if (idx == s.length()) {

            if (bal == 0) {

                String str = curr.toString();

                if (str.length() > maxLen) {
                    maxLen = str.length();
                    ans.clear();
                    ans.add(str);
                } else if (str.length() == maxLen) {
                    ans.add(str);
                }
            }
            return;
        }

        char ch = s.charAt(idx);

        // take
        curr.append(ch);

        if (ch == '(')
            generate(s, idx + 1, curr, bal + 1);
        else if (ch == ')')
            generate(s, idx + 1, curr, bal - 1);
        else
            generate(s, idx + 1, curr, bal);

        curr.deleteCharAt(curr.length() - 1);

        // don't take
        generate(s, idx + 1, curr, bal);
    }
}