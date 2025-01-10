class Solution {
    public int minStartValue(int[] nums) {
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int a:nums){
            ans+=a;
            min=Math.min(ans,min);
        }
        if(min>0) return 1;
        return Math.abs(min)+1;
    }
}