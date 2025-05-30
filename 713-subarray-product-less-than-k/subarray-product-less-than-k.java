class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
       int left=0;
       int right=0;
       int product=1;
       int n=nums.length;
       int ans=0;
       while(right<n){
        product*=nums[right];
        while(product>=k) product/=nums[left++];
        ans+=1+(right-left);
        right++;
       } 
       return ans;
    }
}