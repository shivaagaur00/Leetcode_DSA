class Solution {
    public String compressedString(String word) {
        char prevChar=word.charAt(0);
        int count=1;
        StringBuilder ans=new StringBuilder();
        int n=word.length();
        for(int i=1;i<n;i++){
            if(word.charAt(i)==prevChar){
                count++;
                if(count==10){
                    ans.append(9);
                    ans.append(prevChar);
                    count=1;
                }
            }
            else{
                ans.append(count);
                ans.append(prevChar);
                count=1;
                prevChar=word.charAt(i);
            }
        }
        ans.append(count);
        ans.append(prevChar);
        return ans.toString();
    }
}