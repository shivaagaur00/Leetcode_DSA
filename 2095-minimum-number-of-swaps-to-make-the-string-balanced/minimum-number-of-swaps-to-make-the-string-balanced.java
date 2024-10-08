class Solution {
    public int minSwaps(String s) {
        int max=0;
        int temp=0;
        for(char c:s.toCharArray()){
            if(c=='[') temp--;
            else temp++;
            max=Math.max(max,temp);
        }
        return (max+1)/2;
    }
}