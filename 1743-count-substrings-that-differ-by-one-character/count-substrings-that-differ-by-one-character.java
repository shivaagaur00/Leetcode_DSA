class Solution {
    public int countSubstrings(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1<n2){
            return func(n1,s,t);
        }
        return func(n2,t,s);
    }
    public int func(int n,String s1,String s2){
        int ans=0;
        int n2=s2.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                for(int k=0;k<(n2-i);k++){
                    if(check(s1,s2,j,k,i)) ans++;
                }
            }
        }
        return ans;
    }
    public boolean check(String s1,String s2,int i1,int i2,int add){
        int count=0;
        for(int i=0;i<=add;i++){
            if(s1.charAt(i1+i)!=s2.charAt(i2+i)){
                count++;
            }
            if(count>1) return false;
        }
        if(count==0) return false;
        return true;
    }
}