class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int i=0,j=0,n=s.length();
        int res=0;
        int temp=0;
        while(j<n){
            if(s.charAt(j)=='T'){
                j++;
            }
            else if(temp<k){
                temp++;
                j++;
            }
            else if(s.charAt(i)=='T'){
                i++;
            }
            else{
                i++;
                temp--;
            }
            res=Math.max(res,j-i);
        }
        i=0;
        j=0;
        temp=0;
        while(j<n){
            if(s.charAt(j)=='F'){
                j++;
            }
            else if(temp<k){
                temp++;
                j++;
            }
            else if(s.charAt(i)=='F'){
                i++;
            }
            else{
                i++;
                temp--;
            }
            res=Math.max(res,j-i);
        }
        return res;
    }
}