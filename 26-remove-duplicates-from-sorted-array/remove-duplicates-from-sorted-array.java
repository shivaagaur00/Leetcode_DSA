class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=nums[0];
        int j=1;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=prev){
                prev=nums[i];
                ans++;
                nums[j++]=nums[i];
            }
        }
        return ans;

    }
}