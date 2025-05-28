class Solution {
    public int compress(char[] chars) {
        int curr=1;
        char c=chars[0];
        int i=1;
        int n=chars.length;
        int ans=0;
        String sAns="";
        if(n==1) return 1;
        while(i<n){
            if(chars[i]!=chars[i-1]){
                String temp=""+curr;
                if(curr>1){
                    sAns+=chars[i-1]+""+curr;
                }
                else{
                    sAns+=chars[i-1];
                }
                curr=1;
            }
            else{
                curr++;
            }
            i++;
        }
            String t=""+curr;
            if(curr>1){
                    sAns+=chars[i-1]+""+curr;
                }
                else{
                    sAns+=chars[i-1];
                }
                for(int j=0;j<sAns.length();j++){
                    chars[j]=sAns.charAt(j);
                } 
        return sAns.length();
    }
}