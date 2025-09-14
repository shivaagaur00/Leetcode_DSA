class Solution {
    public String processStr(String s) {
        StringBuilder st=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isAlphabetic(c)){
                st.append(c);
            }
            else if(c=='*' && st.length()>0){
                st.deleteCharAt(st.length() - 1);
            }
            else if(c=='#'){
                st.append(st);
            }
            else if(c=='%'){
                st.reverse();
            }
        }
        return st.toString();
    }
}