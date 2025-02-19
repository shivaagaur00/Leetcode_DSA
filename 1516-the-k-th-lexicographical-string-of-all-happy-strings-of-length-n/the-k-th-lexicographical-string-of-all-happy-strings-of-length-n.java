class Solution {
    String ans = "";
    int nk;
    public String getHappyString(int n, int k) {
        ans = "";
        nk=k;
        solve(0,n, new char[]{'a', 'b', 'c'},new StringBuilder());
        return ans;
    }
    public void solve(int len, int n, char[] chars, StringBuilder s) {
        if (len==n) {
            --nk;
            if(nk==0) {
                ans=s.toString();
            }
            return;
        }
        for (char c:chars) {
            if (len == 0 || s.charAt(len-1)!=c) {
                s.append(c);
                solve(len+1,n,chars,s);
                s.deleteCharAt(s.length()-1);
                if (nk==0) return;
            }
        }
    }
}