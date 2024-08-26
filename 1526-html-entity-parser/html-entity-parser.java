class Solution {
    public String entityParser(String text) {
        String ans="";
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)!='&') ans+=text.charAt(i);
            else{
                String s="&";
                i++;
                while(i<text.length() && text.charAt(i)!=';' && text.charAt(i)!='&'){
                    s+=text.charAt(i);
                    i++;
                }
                if(i<text.length() && text.charAt(i)!='&') s+=text.charAt(i);
                else i--;
                if(s.equals("&quot;")) ans+="\"";
                else if(s.equals("&apos;")) ans+="'";
                else if(s.equals("&amp;")) ans+="&";
                else if(s.equals("&gt;")) ans+=">";
                else if(s.equals("&lt;")) ans+="<";
                else if(s.equals("&frasl;")) ans+="/";
                else ans+=s;
            }
        }
        return ans;
    }
}