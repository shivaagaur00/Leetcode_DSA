class Solution {
    public String fractionAddition(String s) {
        int deno=1;
        boolean flag=false;
        String st="";
        List<Integer> d=new ArrayList<>();
        List<Integer> n=new ArrayList<>();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='/'){
                flag=true;
            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-'){
                flag=false;
                if(st.length()>0) deno*=Integer.parseInt(st);
                d.add(Integer.parseInt(st));
                st="";
                
            }
            else if(flag){
                st+=s.charAt(i);
            }
        }
        if(st.length()>0){
            deno*=Integer.parseInt(st);
            d.add(Integer.parseInt(st));
        }
        st="";
        flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='/'){
                n.add(Integer.parseInt(st));
                flag=false;
                st="";
            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-'){
                flag=true;
                st+=s.charAt(i);
            }
            else if(flag){
                st+=s.charAt(i);
            }   
        }
        if(st.length()>0){
            n.add(Integer.parseInt(st));
        }
        int num=0;
        for(int i=0;i<n.size();i++){
            num+=(n.get(i)*(deno/d.get(i)));
        }
        int min=Math.min(num,deno);
        if(num==0 || deno==0){
            return "0/1";
        }
        int common=gcd(Math.abs(num),Math.abs(deno));
        num/=common;
        deno/=common;
        if(num==0 || deno==0){
            return "0/1";
        }
        return ""+num+"/"+deno;
    }
    public int gcd(int a, int b) {
    int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
    return result;
}
}