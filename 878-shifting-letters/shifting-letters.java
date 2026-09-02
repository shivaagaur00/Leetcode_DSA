class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long sum=0;
        for(int a:shifts){
            sum+=a;
        }
        StringBuilder ans=new StringBuilder();
        int i=0;
        for(char c:s.toCharArray()){
            ans.append((char)('a'+(c-'a'+sum)%26));
            sum-=shifts[i++];
        }
        return ans.toString();
    }
}