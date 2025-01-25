class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int max=0;
        int cost=0;
        for(int i=0,j=0;i<n;i++){
            int a=Math.abs((int)s.charAt(i)-t.charAt(i));
            // if(a>maxCost){
            //     j=i+1;
            // }
            // else{
                cost+=a;
            while((cost)>maxCost){
                cost-=(Math.abs(s.charAt(j)-t.charAt(j)));
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}