class Solution {
    public String truncateSentence(String s, int k) {
        String l="";
        int j=0;
        while(k!=0 && s.length()!=j){
            if(s.charAt(j)==' '){
                k--;
            }
            l+=s.charAt(j);
            j++;
        }
        if(l.charAt(l.length()-1)==' '){
            l=l.substring(0,l.length()-1);
        }
        return l;
    }
}