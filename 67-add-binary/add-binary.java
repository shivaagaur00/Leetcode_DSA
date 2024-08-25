class Solution {
    public String addBinary(String a, String b) {
        int n=0;
        String ans="";
        int id1=a.length()-1;
        while(a.length()!=0 || b.length()!=0){
                if(a.length()>0){
                    n+=Character.getNumericValue(a.charAt(a.length()-1));
                    a=a.substring(0,a.length()-1);
                } 
                if(b.length()>0){
                    n+=Character.getNumericValue(b.charAt(b.length()-1));
                    b=b.substring(0,b.length()-1);
                }
                ans=(n%2)+ans;
                n/=2;
            }
            if(n!=0) ans=n+ans;
        return ans;
    }
}