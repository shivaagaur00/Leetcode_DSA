class Solution {
    public String removeKdigits(String num, int k) {
        String ans = "";
        Stack<Integer> st = new Stack<>();
        for (char c : num.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > (c - '0')) {
                st.pop();
                k--;
            }
            st.add(c - '0');
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }
        int i = 0;
        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }
        ans = ans.substring(i);
        return ans.length() == 0 ? "0" : ans;
    }
}