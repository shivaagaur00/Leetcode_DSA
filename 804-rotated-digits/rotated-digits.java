class Solution {
    public int rotatedDigits(int n) {
        int ans=0;
        for(int i=0;i<=n;i++){
            if(!number_check(i)) continue;
            else{
                System.out.println(i);
                ans++;
            }
        }
        return ans;
    }
    public boolean number_check(int n){
        String s=""+n;
        boolean flag=true;
        boolean flag2=true;
        char ch=s.charAt(0);
        for(char c:s.toCharArray()){
            if(c=='3' || c=='4' || c=='7') flag=false;
            // if(s.equals("10")) System.out.println(c+" "+flag2);
            if(!(c=='0' || c=='8' || c=='1')) flag2=false;
        }
        // if(s.equals("10")) System.out.println(flag2);
        // if(ch=='0' || ch=='8' || ch=='1'){
        if(flag2) return false;
        // }
        return flag;
    }
}