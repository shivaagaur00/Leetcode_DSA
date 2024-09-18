class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]) || map.get(nums[i])<2){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                nums[j++]=nums[i];
                ans++;
            }
            else map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return ans;
    }
}