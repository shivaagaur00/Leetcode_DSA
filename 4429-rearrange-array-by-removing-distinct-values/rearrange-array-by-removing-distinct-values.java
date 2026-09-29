class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int [nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        while(true){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        for(int a : keys) {
            list.add(a);
            map.put(a, map.get(a) - 1);
            if(map.get(a) == 0) {
                map.remove(a);
                }
        }
        Collections.sort(list);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            ans[idx]=list.get(i);
            idx++;
        }
       
        if(map.size()==0){
            break;
        }
        }
        return ans;

    }
}