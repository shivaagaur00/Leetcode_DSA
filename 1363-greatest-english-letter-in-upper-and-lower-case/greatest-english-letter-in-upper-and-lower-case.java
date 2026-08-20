class Solution {
    public String greatestLetter(String s) {
        boolean[]l=new boolean[256];
        boolean[]u=new boolean[256];
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                l[ch-'a']=true;
            }
            else if(ch>='A' && ch<='Z'){
                u[ch-'A']=true;
            }
        }
        for(int i=25;i>=0;i--){
            if(l[i] && u[i]){
                return String.valueOf((char)(i+'A'));
            }
        }
        return "";
    }
}