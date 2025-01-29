class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->Integer.compare(Math.abs(a),Math.abs(b)));
        for (int num:list) {
            int count=map.get(num);
            if (count==0)
                continue;
            int pair = map.getOrDefault(2*num, 0);
            if (count>pair) return false;
            map.put(2*num,pair-count);
        }
        
        return true;
    }
}