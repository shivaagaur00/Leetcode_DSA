class Solution {
    public int numSub(String s) {
        List<String> arr=new ArrayList<>();
        int temp=0;
        int ans=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                temp++;
                ans+=temp;
                ans=ans%1000000007;
            }
            else temp=0;
        }
        return ans;
    }
}