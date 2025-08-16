class Solution {
    public int maximum69Number (int num) {
        String st=""+num;
        boolean flag=true;
        StringBuilder ans=new StringBuilder();
        for(char c:st.toCharArray()){
            if(flag && c=='6'){
                ans.append('9');
                flag=false;
            }
            else{
                ans.append(c);
            }
        }
        return Integer.parseInt(ans.toString());
    }
}