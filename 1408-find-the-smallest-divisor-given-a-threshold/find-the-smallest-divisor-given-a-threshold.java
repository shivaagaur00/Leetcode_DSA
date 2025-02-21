class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=nums[0];
        for(int a:nums) max=Math.max(max,a);
        int i=1,j=max;
        int ans=1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int res=func(mid,nums);
            if(res>threshold){
                i=mid+1;
            }
            else if(res<=threshold){
                ans=mid;
                j=mid-1;
            }
        }  
        return ans;
    }
    public int func(int a,int[] arr){
        int ans=0;
        for(int i:arr){
            if(i%a==0) ans+=i/a;
            else ans+=i/a+1;
        }
        return ans;
    }
}