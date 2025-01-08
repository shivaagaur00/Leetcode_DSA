class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(a+b);
            }
            else if(tokens[i].equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(tokens[i].equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            else if(tokens[i].equals("*")){
                int a=st.pop();
                int b=st.pop();
                st.push(a*b);
            }
            else st.push(Integer.parseInt(tokens[i]));
        }
        return st.pop();
    }
}