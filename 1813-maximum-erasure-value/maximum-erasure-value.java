class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max=0;
        Set<Integer> set=new HashSet<>();
        int i=0;
        int j=0;
        int ans=0;
        for(;i<nums.length;i++){
            while(!set.add(nums[i])){
                ans-=nums[j];
                set.remove(nums[j++]);
            }
            ans+=nums[i];
            max=Math.max(ans,max);
        }
        return max;
    }
}