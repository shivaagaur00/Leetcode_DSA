class Solution {
    public int getLucky(String s, int k) {
        List<Integer> arr=new ArrayList<>();
        String st="";
        for(int i=0;i<s.length();i++){
            st+=(s.charAt(i)-'a'+1);
        }
        int ans=0;
        while(k-->0){
            String temp=st;
            ans=0;
            for(int i=0;i<st.length();i++){
                ans+=(Character.getNumericValue(st.charAt(i)));
            }
            st=""+ans;
        }
        return ans;
    }
}