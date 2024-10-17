class Solution {
    public long minimumSteps(String s) {
        long ans=0;
        long temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') temp++;
            else{
                ans+=temp;
            }
        } 
        return ans;
    }
}