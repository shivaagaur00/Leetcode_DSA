class Solution {
    public int percentageLetter(String s, char letter) {
        int[] arr=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
        }
        return (arr[letter-'a']*100/s.length());
    }
}