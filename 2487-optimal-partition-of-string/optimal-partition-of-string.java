class Solution {
    public int partitionString(String s) {
        boolean flag[]=new boolean[26];
        int i=0;
        int max=0;
        int n=s.length();
            int curr=0;
        while(i<n){
            Arrays.fill(flag,false);
            curr++;
            while(i<n && !flag[s.charAt(i)-'a']){
                flag[s.charAt(i)-'a']=true;
                i++;
            }
        }
        return curr;
    }
}