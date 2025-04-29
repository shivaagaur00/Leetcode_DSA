class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int a:nums) max=Math.max(max,a);
        int count=0;
        int n=nums.length;
        int j=0;
        long ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]==max) count++;
            while(count>=k){
                if(nums[j]==max) count--;
                j++;
            }
            ans+=j;
        }
        return ans;
    }
}