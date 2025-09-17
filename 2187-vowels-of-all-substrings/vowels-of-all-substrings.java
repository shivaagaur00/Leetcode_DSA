class Solution {
    public long countVowels(String word) {
        long ct=0;
        long count=0;
        for(char c:word.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                ct++;
            }
            count+=ct;
        }
        long ans=0;
        ct=0;
        int len=word.length();
        for(char c:word.toCharArray()){
            ans+=count;
            len--;
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count-=len;
                count--;
            }
        }
        return ans;
    }
}