class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int mid=nums.length/2;
        int m=nums[mid];
            if(map.get(m)==1){
                return true;
            
        }
        return false;

        
    }
}