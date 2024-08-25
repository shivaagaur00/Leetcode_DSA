class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int id1=0;
        int id2=0;
        while(id1<word1.length() || id2<word2.length()){
            if(id1<word1.length()) {
                ans+=word1.charAt(id1);
                id1++;
            }
            if(id2<word2.length()) {
                ans+=word2.charAt(id2);
                id2++;
            }
        }
        return ans;
    }
}