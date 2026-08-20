class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> temp=new ArrayList<>();
        for(int a:nums){
            if(map.getOrDefault(a,0)==k) continue;
            else{
                temp.add(a);
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        int ans[]=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}