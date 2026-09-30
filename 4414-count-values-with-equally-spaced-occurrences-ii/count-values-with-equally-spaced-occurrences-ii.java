class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
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
            if(list.size()>=3){
                boolean flag=true;
                int d=list.get(1)-list.get(0);
                for(int i=0;i<list.size()-1;i++){
                    if((list.get(i+1)-list.get(i))!=d){
                        flag=false;
                    }
                }
                if(flag){
                    count++;
                }
            }
        }
        return count;
        
    }
}