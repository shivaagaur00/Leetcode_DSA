class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] count=new int[26];
        for(char c:allowed.toCharArray()){
            count[c-'a']++;
        }
        int ans=0;
        for(int j=0;j<26;j++){
            for(int i=0;i<words.length;i++){
                if(count[j]==0 && words[i].contains(""+(char)(j+'a'))){
                    words[i]="";
                    ans++;
                }
            }
        }
        return words.length-ans;
    }
}