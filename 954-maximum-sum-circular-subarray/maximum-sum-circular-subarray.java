class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int[] suffix=new int[n+1];
        suffix[n-1]=nums[n-1];
        int suff=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suff+=nums[i];
            suffix[i]=Math.max(suffix[i+1],suff);
        }
        int currSum=0;
        int max=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE;
        int pref=0;
        for(int i=0;i<n;i++){
            currSum=Math.max(nums[i],nums[i]+currSum);
            max=Math.max(currSum,max);
            pref+=nums[i];
            ans=Math.max(ans,pref+suffix[i+1]);
        }
        return Math.max(ans,max);

    }
}