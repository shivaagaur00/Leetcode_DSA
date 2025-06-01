class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int n=s.length();
        if(n<3) return n;
        int start=0;
        int i=1;
        boolean curr=false;
        int ans=1;
        int prev=0;
        while(i<n){
            if(s.charAt(i-1)==s.charAt(i)){
                if(curr){
                    start=prev;
                    prev=i;
                }
                else{
                    prev=i;
                    curr=true;
                }
            }
            ans=Math.max((i-start+1),ans); 
            i++;
        }
        return ans;
    }
}