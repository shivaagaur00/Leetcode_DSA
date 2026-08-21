class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] even=new int[26];
        int[] odd=new int[26];
        for(int i=0;i<s1.length();i+=2){
            even[s1.charAt(i)-'a']++;
        }
        for(int i=1;i<s1.length();i+=2){
            odd[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i+=2){
            even[s2.charAt(i)-'a']--;
        }
        for(int i=1;i<s1.length();i+=2){
            odd[s2.charAt(i)-'a']--;
        }
        for(int a:even){
            if(a<0) return false;
        }
        for(int a:odd){
            if(a<0) return false;
        }
        return true;
    }
}