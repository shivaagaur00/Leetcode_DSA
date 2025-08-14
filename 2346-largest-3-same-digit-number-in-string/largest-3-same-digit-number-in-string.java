class Solution {
    public String largestGoodInteger(String num) {
        int max=-1;
        int n=num.length();
        for(int i=0;i<=n-3;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)) max=Math.max(max,num.charAt(i)-'0');
        }
        StringBuilder st=new StringBuilder(""+max);
        st.append(st);
        st.append(max);
        return max==-1?"":st.toString();
    }
}