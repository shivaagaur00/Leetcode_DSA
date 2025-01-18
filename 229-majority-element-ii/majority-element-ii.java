class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int n=nums.length/3;
        for(int a:map.keySet()){
            if(map.get(a)>n) arr.add(a);
        }   
        return arr;
    }
}