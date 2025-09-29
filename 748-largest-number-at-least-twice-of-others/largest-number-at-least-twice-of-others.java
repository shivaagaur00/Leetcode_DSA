class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        int ans=-1;
        int i=0;
        for(int a:nums){
            if(a>max){
                min=max;
                max=a;
                ans=i;
            }
            else if(a>min){
                min=a;
            }
            i++;
        }
        // System.out.println(max+" "+min);
        if(min*2<=max) return ans;
        return -1;
    }
}