class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        int[] charLower=new int[26];
        int[] charUpper=new int[26];
        int idx=0;
        Arrays.fill(charLower,-1);
        Arrays.fill(charUpper,-1);
        
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c) && charUpper[c-'A']==-1) charUpper[c-'A']=idx;
            else if(Character.isLowerCase(c)) charLower[c-'a']=idx;      
            idx++;      
        }
        for(int i=0;i<26;i++){
            if(charLower[i]>=0 && charUpper[i]>=0 && charLower[i]<charUpper[i]) ans++;
        }
        return ans;
    }
}