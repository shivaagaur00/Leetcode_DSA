class Solution {
    public String largestOddNumber(String num) {
        if((num.charAt(num.length()-1)-'0')%2!=0) return num;
        String ans="";
        boolean flag=true;
        for(int i=num.length()-1;i>=0;i--){
            if((flag && (num.charAt(i)-'0')%2==0)){
                continue;
            }
            else{
                flag=false;
                ans=num.charAt(i)+ans;
            }

        }
        
        return ans;



        
    }
}