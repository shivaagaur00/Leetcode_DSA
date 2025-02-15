class Solution {
    public int findMin(int[] nums) {
        int min=0;
        int i=0;
        int j=nums.length-1;
        int ans=nums[0];
        while(i<=j){
            ans=Math.min(ans,nums[i]);
            ans=Math.min(ans,nums[j]);
            if(nums[i]<nums[j]) return ans;
            i++;
            j--;
        }
        return ans;
    }
}