class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        
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
            System.out.println(list);
            for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    if(Math.abs(list.get(i)-list.get(j))<=k){
                        return true;
                        
                    }
                }
            }
        }
        return false;
        
        
        
    }
}