class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long rightsum=0;
        for(int a:nums) rightsum+=a;
        int idx=0;
        long left=0;
        long temp=rightsum;
        long ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            left+=nums[i];
            rightsum-=nums[i];
            long leftavg=(left)/(i+1);
            long rightavg=(i==n-1)?0:(rightsum)/(n-i-1);
            if(ans>(Math.abs(leftavg-rightavg))){
            ans=Math.abs(leftavg-rightavg);
            idx=i;
            }
        }
        return idx;
    }
}