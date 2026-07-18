class Solution {
    public String minRemoveToMakeValid(String s) {
        int open=0;
        int close=0;
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==')' && close+1<=open){
                ans.append(')');
                close++;
            }
            else if(c!=')'){
                if(c=='(') open++;
                ans.append(c);
            }
        }
        StringBuilder temp=new StringBuilder();
        for(int i=ans.length()-1;i>=0;i--){
            if(ans.charAt(i)=='(' && open>close){
                open--;
            }
            else{
                temp.append(ans.charAt(i));
            }
        }

        return temp.reverse().toString();
    }
}