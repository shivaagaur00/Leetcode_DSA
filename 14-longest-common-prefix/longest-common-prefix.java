class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        for(String s:strs){
            min=Math.min(s.length(),min);
        }
        String ans="";
        for(int i=0;i<min;i++){
            char c=strs[0].charAt(i);
            boolean flag=false;
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=c){
                    flag=true;
                    break;
                }
            }
            if(flag) break;
            else ans+=c;
        }
        return ans;
    }
}