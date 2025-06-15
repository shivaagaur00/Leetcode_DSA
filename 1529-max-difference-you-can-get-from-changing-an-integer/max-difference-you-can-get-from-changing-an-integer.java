class Solution {
    public int maxDiff(int num) {
        StringBuilder s1=new StringBuilder("");
        String st=""+num;
        StringBuilder s2=new StringBuilder("");
        char c='1';
        if(st.charAt(0)!='1'){
            c=st.charAt(0);
            for(char ch:st.toCharArray()){
                if(ch==c) s1.append('1');
                else{
                    s1.append(ch);
                }
            }
        }
        else{
            for(char ch:st.toCharArray()){
                if(ch!='1' && ch!='0'){
                    c=ch;
                    break;
                }
            }
            for(char ch:st.toCharArray()){
                if(ch==c) s1.append((c=='1')?'1':'0');
                else s1.append(ch);
            }            
        }
        c='9';
        if(st.charAt(0)!='9'){
            c=st.charAt(0);
            for(char ch:st.toCharArray()){
                if(ch==c) s2.append('9');
                else{
                    s2.append(ch);
                }
            }
        }
        else{
            for(char ch:st.toCharArray()){
                if(ch!='9'){
                    c=ch;
                    break;
                }
            }
            for(char ch:st.toCharArray()){
                if(ch==c) s2.append('9');
                else s2.append(ch);
            }            
        }
        return Integer.parseInt(s2.toString())-Integer.parseInt(s1.toString());

    }
}