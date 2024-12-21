class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i:stones){
            map.put(i,new HashSet<>());
        }
        map.get(0).add(0);
        for(int stone:stones){
            for(int j:map.get(stone)){
                for(int i:new int[]{j-1,j,j+1}){
                    if(i>0 && map.containsKey(i+stone)){
                        map.get(i+stone).add(i);
                    }
                }
            }
        }
        return !map.get(stones[stones.length-1]).isEmpty();
    }
}