class Solution {
    public int maxScore(String s) {
        int oneC=0;
        int zeroC=0;
        for(char c:s.toCharArray()){
            if(c=='1') oneC++;
            else zeroC++; 
        }
        if(oneC==0 ) return s.length()-1;
        int right=oneC;
        int left=0;
        int ans=0;
        int count=0;
        for(char c:s.toCharArray()){
            count++;
            if(count>=s.length()) break;
            if(c=='1'){
                right--;
            }
            else{
                left++;
            }
            ans=Math.max(ans,right+left);
        }
        return ans;
    }
}