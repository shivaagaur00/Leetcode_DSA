class Solution {
    public int numSub(String s) {
        int temp=0;
        int ans=0;
        for(char c:s.toCharArray()){
            if(c=='1') ans=(ans+(++temp))%1000000007;
            else temp=0;
        }
        return ans;
    }
}