class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] ans=new int[26];
        for(int i=0;i<26;i++){
            ans[i]=-1;
        }
        for(int i=0;i<s.length();i++){
            if(ans[s.charAt(i)-'a']!=-1){
                ans[s.charAt(i)-'a']=i-ans[s.charAt(i)-'a']-1;
            }
            else{
                ans[s.charAt(i)-'a']=i;
            }
        }
        for(int i=0;i<26;i++){
            // System.out.println(ans[i]);
            if(ans[i]!=-1 && ans[i]!=distance[i]){
                return false;
            }
        }
        return true;
    }
}