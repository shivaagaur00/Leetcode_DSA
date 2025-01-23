class Solution {
    public int tupleSameProduct(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                map.put(nums[i]*nums[j],map.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>1) ans+=(map.get(key)*(map.get(key)-1)/2)*8;
            // Combinationformula=nC2=n*(n-1)/2;
        }
        return ans;
    }
}