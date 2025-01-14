class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int[] a:operations){
            int temp=map.get(a[0]);
            map.remove(a[0]);
            map.put(a[1],temp);
        }
        for(int key:map.keySet()){
            nums[map.get(key)]=key;
        }
        return nums;
    }
}