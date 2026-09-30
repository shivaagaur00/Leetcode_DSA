class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }else{
                map.get(nums[i]).add(i);
            }
        }
        for(int key:map.keySet()){
            ArrayList<Integer> list=new ArrayList<>(map.get(key));
            if(list.size()==3){
                if((list.get(1)-list.get(0))==(list.get(2)-list.get(1))){
                    count++;
                }
            }
        }
        return count;
    }
}