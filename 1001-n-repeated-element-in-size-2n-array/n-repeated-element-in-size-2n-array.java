class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int a:map.keySet()){
            if(map.get(a)==n) return a;
        }
        return 0;
    }
}