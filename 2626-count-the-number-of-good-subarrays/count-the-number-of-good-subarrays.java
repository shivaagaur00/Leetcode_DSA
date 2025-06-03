class Solution {
    public long countGood(int[] nums, int k) {
        long ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int i=0;
        int j=0;
        int curr=0;
        for(;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            curr+=(map.get(nums[i])-1);
                while(curr>=k){
                    ans+=(n-i);
                    curr-=(map.get(nums[j])-1);
                    map.put(nums[j],map.get(nums[j])-1);
                    j++;
                    }
                }
        return ans;
    }
}