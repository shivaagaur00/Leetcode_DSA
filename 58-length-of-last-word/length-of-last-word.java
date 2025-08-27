class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        s=s.trim();
        int n=s.length()-1;
        while(n>=0){
            if(s.charAt(n)==' ') break;
            ans++;
            n--;
        }
        return ans;
    }
}