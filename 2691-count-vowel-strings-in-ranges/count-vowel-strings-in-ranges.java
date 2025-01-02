class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans=new int[words.length+1];
        int i=0;
        int count=0;
        for(String s:words){
            ans[i+1]=ans[i];
            if((s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u') && (s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='e' || s.charAt(s.length()-1)=='i' || s.charAt(s.length()-1)=='o' || s.charAt(s.length()-1)=='u')){
                ans[i+1]++;
            }
            i++;
        }
        i=0;
        int[] out=new int[queries.length];
        for(int[] arr:queries){
            out[i++]=ans[arr[1]+1]-ans[arr[0]];
        }
        return out;
    }
}