class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int a:map.keySet()){
            List<Integer> temp=new ArrayList<>();
            temp.add(a);
            temp.add(map.get(a));
            ls.add(temp);
        }
        Collections.sort(ls,(a,b)->a.get(0)-b.get(0));
        boolean flag=true;
        int id=0;
        int ans[]=new int[nums.length];
        while(flag){
            flag=false;
            for(int i=0;i<ls.size();i++){
                if(ls.get(i).get(1)>0){
                    ans[id++]=ls.get(i).get(0);
                    ls.get(i).set(1, ls.get(i).get(1) - 1);
                    flag=true;
                }
            }
        }
        return ans;
    }
}