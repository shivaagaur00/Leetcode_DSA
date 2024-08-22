class Solution {
    public int findComplement(int num) {
        String s="";
        while(num>0){
            s+=(num%2);
            num/=2;
        }    
        int ans=0;
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') ans+=(Math.pow(2,idx));
            idx++;
        }
        return ans;
    }

}