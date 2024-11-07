class Solution {
    public int largestCombination(int[] candidates) {
        int max=0;
        for(int i=0;i<=24;i++){
            int temp=0;
            for(int a:candidates){
                if((a&(1<<i))!=0) temp++;
            }
            max=Math.max(max,temp);
        }
        return max;
    }
}