class Solution {
    public boolean rotateString(String s, String goal) {
        int i=0;
        while(i<s.length()){
            s=s.substring(1,s.length())+s.charAt(0);
            if(s.equals(goal)){
                return true;
            }
            i++;
        }
        return false;
    }
}