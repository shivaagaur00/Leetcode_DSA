class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String s:operations){
            if(s.charAt(0)=='+' || s.charAt(s.length()-1)=='+'){
                ans++;
            }
            else ans--;
        }
        return ans;
    }
}