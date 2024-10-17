class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        for(String s:strs) min=Math.min(s.length(),min);
        String ans="";
        for(int i=0;i<min;i++){
            char c=strs[0].charAt(i);
            for(String st:strs){
                if(st.charAt(i)!=c){
                    return ans;
                }
            }
            ans+=c;
        }
        return ans;
    }
}