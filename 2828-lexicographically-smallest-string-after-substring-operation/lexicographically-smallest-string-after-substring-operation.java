class Solution {
    public String smallestString(String s) {
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        int i=0;
        while (i<n && s.charAt(i)=='a') {
            ans.append('a');
            i++;
        }
        if (i==n) {
            ans.setCharAt(ans.length()-1,'z');
            return ans.toString();
        }
        while(i<n && s.charAt(i)!='a') {
            char shift=(char)((s.charAt(i)-'a'-1+26)%26+'a');
            ans.append(shift);
            i++;
        }
        ans.append(s.substring(i));
        return ans.toString();
    }
}
