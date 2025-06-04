class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        int ans=s.length();
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                char curr=s.charAt(i);
                while(i<j && s.charAt(i)==curr){
                    ans--;
                    i++;
                }
                if(i==j) i--;
                while(j>i && s.charAt(j)==curr){
                    ans--;
                    j--;
                }
            } 
            else break;
        }
        return ans;
    }
}