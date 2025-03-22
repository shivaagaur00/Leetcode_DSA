class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int n=nums.length;
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])) map.get(nums[i]).add(i);
            else {
                 List<Integer> list = new ArrayList<>();
                 list.add(i);
                 map.put(nums[i],list);
            }
        }
        for(int i=0;i<n;i++){
            if((nums[i]+nums[i])==target){
                if(map.get(nums[i]).size()>1){
                ans[0]=map.get(nums[i]).get(0);
                ans[1]=map.get(nums[i]).get(1);
                return ans;
                }
            }
            else{
                if(map.containsKey(target-nums[i])){
                    ans[0]=map.get(nums[i]).get(0);
                    ans[1]=map.get(target-nums[i]).get(0);
                    return ans;
                }
            }
        }
        return ans;
    }
}