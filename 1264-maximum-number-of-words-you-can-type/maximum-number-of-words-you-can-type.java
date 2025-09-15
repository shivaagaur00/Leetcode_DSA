class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean resitrict[]=new boolean[127];
        for(char c:brokenLetters.toCharArray()){
            resitrict[c-' ']=true;
        }  
        int ans=0;
        String[] arr=text.split(" ");
        for(String s:arr){
            boolean flag=true;
        for(char c:s.toCharArray()){
            if(resitrict[c-' ']){
                flag=false;
                break;
            }
        }
        if(flag) ans++;
        }
        return ans;
    }
}