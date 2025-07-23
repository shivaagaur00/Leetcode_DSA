class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st=new Stack<>();
        boolean flag=x>y;
        String r="ba";
        if(flag){
            r="ab";
        }
        int ans=0;
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==r.charAt(0) && c==r.charAt(1)){
                st.pop();
                if(flag) ans+=x;
                else ans+=y;
            }
            else st.push(c);
        }
        s="";
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        s=sb.toString();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==r.charAt(0) && c==r.charAt(1)){
                st.pop();
                if(flag) ans+=y;
                else ans+=x;
            }
            else st.push(c);
        }
        return ans;
    }
}