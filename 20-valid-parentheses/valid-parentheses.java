class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(!st.isEmpty()){
                if(st.peek()=='(' && s.charAt(i)==')') st.pop();
                else if(st.peek()=='{' && s.charAt(i)=='}') st.pop();
                else if(st.peek()=='[' && s.charAt(i)==']') st.pop();
                else st.push(s.charAt(i));
            }
            else st.push(s.charAt(i));
            i++;
        }
        if(st.isEmpty()) return true;
        return false;
    }
}