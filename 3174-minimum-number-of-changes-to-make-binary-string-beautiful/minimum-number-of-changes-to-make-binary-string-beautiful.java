class Solution {
    public int minChanges(String s) {
        int i=0;
        int ans=0;
        while(i<s.length()-1){
            if(s.charAt(i)!=s.charAt(i+1)){
                ans++;
            }
            i+=2;
        }
        return ans;
    }
}