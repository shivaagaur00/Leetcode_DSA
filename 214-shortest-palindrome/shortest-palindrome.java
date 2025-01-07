class Solution {
    public String shortestPalindrome(String s) {
        int n=s.length();
        String rev=func(s);
        for(int i=0;i<n;i++){
            if(s.substring(0,n-i).equals(rev.substring(i))) return rev.substring(0,i)+s;
        }
        return rev+s;
    }
    public String func(String s){
        StringBuilder st=new StringBuilder(s);
        st.reverse();
        return st.toString();
    }
}