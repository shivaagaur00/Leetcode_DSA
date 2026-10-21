class Solution {
    public String thousandSeparator(int n) {
        String s=n+"";
        if(s.length()<=3){
            return s;
        }
        int c=0;
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            
            if( c!=0 && c%3==0){
                ans+=".";


            }
            ans+=s.charAt(i);
            c++;
        }
        StringBuilder st=new StringBuilder(ans);

        return st.reverse().toString();
    }
       
}