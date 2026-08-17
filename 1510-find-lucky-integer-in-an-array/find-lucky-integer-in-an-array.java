class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> ls=new ArrayList<>();
        int ans=0;
        for(int a:map.keySet()){
            if(a==map.get(a)) ls.add(a);
        }
        Collections.sort(ls);
        if(ls.size()==0) return -1;
        return ls.get(ls.size()-1);
    }
}