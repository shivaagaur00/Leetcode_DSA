class Solution {
    public int maxFreqSum(String s) {
        int[] ct=new int[26];
        for(char c:s.toCharArray()){
            ct[c-'a']++;
        }
        int max=0;
        int max2=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                max=Math.max(ct[i],max);
            }
            else{
                max2=Math.max(max2,ct[i]);
            }
        }
        return max+max2;
    }
}