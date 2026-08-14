class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        int count[]=new int[26];
        int j=0;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            if(count[s.charAt(i)-'a']>2){
                // System.out.println(i+" "+j);
                max=Math.max(max,i-j);
                while(s.charAt(j)!=s.charAt(i)){
                    // if(i==5){
                    //     System.out.println("inner "+i+" "+j);
                    // }
                    count[s.charAt(j)-'a']--;
                    j++;
                }
                count[s.charAt(j)-'a']--;
                j++;

            }
        }
        // System.out.println(j+"ds");
        return Math.max(max,s.length()-j);

    }
}