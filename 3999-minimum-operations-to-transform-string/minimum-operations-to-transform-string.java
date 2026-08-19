class Solution {
    public int minOperations(String s) {
        int max=0;
        for(char c:s.toCharArray()){
            if(c!='a') max=Math.max(('z'-c)+1,max);
        }
        return max;
    }
}