class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int j=nums.length-1;
        int ans=0;
        while(j>=0){
            if(nums[i]>nums[j]){
                i--;
                j--;
                ans++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}