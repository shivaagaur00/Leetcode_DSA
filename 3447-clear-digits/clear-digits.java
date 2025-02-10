class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch) && !st.isEmpty()) st.pop();
            if(!Character.isDigit(ch)) st.push(ch);
        }
        StringBuilder ans=new StringBuilder("");
        while(!st.isEmpty()){
            ans.append(st.pop()+"");
        }
        ans.reverse();
        return ans.toString();
    }
}