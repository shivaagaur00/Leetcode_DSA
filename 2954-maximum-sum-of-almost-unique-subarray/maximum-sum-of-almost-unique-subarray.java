class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long sum=0;
        int j=0;
        Map<Integer,Integer> map=new HashMap<>();
        long ans=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            sum+=nums.get(i);
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
            if(map.size()>=m && (i-j+1)==k){
                ans=Math.max(ans,sum);
            }
            if((i-j+1)==k){
                sum-=nums.get(j);
                map.put(nums.get(j),map.getOrDefault(nums.get(j),0)-1);
                if(map.get(nums.get(j))==0) map.remove(nums.get(j));
                j++;
            }
        } 
        return ans;  
    }
}