class Solution {
    public String getHint(String secret, String guess) {
        int[] s=new int[10];
        int[] g=new int[10];
        String ans="";
        int correct=0;
        for(int i=0;i<secret.length();i++){
            s[Character.getNumericValue(secret.charAt(i))]++;
            g[Character.getNumericValue(guess.charAt(i))]++;
            if(secret.charAt(i)==guess.charAt(i)) correct++;
        }
        int pos=0;
        for(int i=0;i<10;i++){
            if(s[i]<=g[i]) pos+=s[i];
            else pos+=g[i];
        }
        ans+=(correct+"A")+(pos-correct)+"B";
        return ans;
    }
}