class Solution {
    public String countAndSay(int n) {
     String s="";
     for(int i=1;i<=n;i++){
        if(i==1){
            s="1";
        }
        else{
            String a="";
            String ans="";
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(j)==s.charAt(j+1)){
                    a+=s.charAt(j);
                }
                else{
                    ans+=(a.length()+1)+""+s.charAt(j);
                    a="";
                }
            }
            ans+=(a.length()+1)+""+s.charAt(s.length()-1);
            s=ans;
        }
     }
     return s;
    }
}