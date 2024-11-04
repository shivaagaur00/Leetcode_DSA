class Solution {
    public String compressedString(String word) {
        String ans="";
        int n=0;
        char c=word.charAt(0);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=c){
                if(n>0) ans+=""+n+c;
                c=word.charAt(i);
                n=1;
            }
            else{
                n++;
                if(n==9){
                    ans+="9"+c;
                    n=0;
                }
            }
        }
        if(n>0) ans+=""+n+c;
        return ans;
    }
}