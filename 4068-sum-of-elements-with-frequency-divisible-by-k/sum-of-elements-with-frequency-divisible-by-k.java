class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int ans=0;
        for(int a:nums){
            if(map.get(a)%k==0) ans+=a;
        }
        return ans;
    }
}