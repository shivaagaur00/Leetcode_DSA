class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n-2;i++){
            if(nums[i]==0){
                nums[i]^=1;
                if(i+1<n) nums[i+1]^=1;
                if(i+2<n) nums[i+2]^=1;
                ans++;
            }
        }
        for(int a:nums) if(a==0) return -1;
        return ans;
    }
}