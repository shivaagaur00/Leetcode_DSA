class Solution {
    public String lastNonEmptyString(String s) {
        int[] counter=new int[26];
        int max=0;
        for(char c:s.toCharArray()){
            counter[c-'a']++;
            max=Math.max(counter[c-'a'],max);
        }
        StringBuilder ans=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(counter[c-'a']==max){
                counter[c-'a']=0;
                ans.append(c);
            }
        }
        ans.reverse();
        return ans.toString();
    }
}