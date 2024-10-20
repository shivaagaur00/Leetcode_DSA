class Solution {
    public int countHomogenous(String s) {
        int temp=0;
        int ans=0;
        char prev='0';
        for(char c:s.toCharArray()){
            if(c==prev){
                ans=(ans+(++temp))%1000000007;
            }
            else{
                ans+=1;
                temp=1;
                prev=c;
            }
        }
        return ans;
    }
}