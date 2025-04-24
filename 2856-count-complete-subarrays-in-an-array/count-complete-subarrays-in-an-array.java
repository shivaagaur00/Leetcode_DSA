class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,0);
        }
        int count=map.size();
        int curr=0;
        int id=0;
        int ans=0;
        int n=nums.length;
        int i=0;
        while(i<n){
            if(map.get(nums[i])==0){
                curr++;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(curr==count ){
                map.put(nums[id],map.get(nums[id])-1);
                ans+=n-i;
                if(map.get(nums[id])==0) curr--;
                id++;
            }
            i++;
        }
        return ans;
    }
}