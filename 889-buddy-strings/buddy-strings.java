class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        boolean flag=false;
        char[] crr=new char[4];
        int[]arr=new int[26];
        int id=0;
        if(s.equals(goal)) flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                if(id==4) {
                    return false;
                }
                crr[id++]=s.charAt(i);
                crr[id++]=goal.charAt(i);
            }
            arr[s.charAt(i)-'a']++;
        }
        if(flag){
        for(int i=0;i<26;i++){
            if(flag && arr[i]>=2) return true;
        }
        }
        else{
            if(crr[0]!=crr[3] || crr[1]!=crr[2]) return false;
            else return true;
        }
        return false;
    }
}