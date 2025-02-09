class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        int i=0;
        int j=1;
        int n=nums.length;
        while(j<n){
            int diff=nums[j]-nums[i];
            if(diff==k){
                i++;
                j++;
                ans++;
                while(j<n && nums[j-1]==nums[j]) j++;
            }
            else if(diff>k){
                i++;
                if(i==j){
                    j++;
                }
            }
            else{
                j++;                
            }
        }
        return ans;
    }
}