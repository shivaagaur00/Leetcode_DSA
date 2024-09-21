class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        func(list,arr,0,nums);
        return list;    
    }
    public void func(List<List<Integer>> arr,List<Integer> list,int i,int[] nums){
        arr.add(new ArrayList<>(list));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            list.add(nums[j]);
            func(arr,list,j+1,nums);
            list.remove(list.size()-1);
        }
    }
}