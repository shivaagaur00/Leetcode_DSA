class FindSumPairs {
List<Integer> arr=new ArrayList<>();
int nums[];
Map<Integer,Integer> map1=new HashMap<>();
Map<Integer,Integer> map2=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        nums=nums1;
        for(int a:nums1){
            map1.put(a,map1.getOrDefault(a,0)+1);
        }
        for(int a:nums2){
            map2.put(a,map2.getOrDefault(a,0)+1);
            arr.add(a);
        }
    }
    public void add(int index, int val) {
        int a=arr.get(index);
        arr.set(index,a+val);
        map2.put(a,map2.get(a)-1);
        map2.put(val+a,map2.getOrDefault(val+a,0)+1);
    }
    public int count(int tot) {
        int ans=0;
         for(int a:map1.keySet()){
            if(map2.containsKey(tot-a)){
                ans+=(map1.get(a)*map2.get(tot-a));
            }
        }
        return ans;
    }
}
/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */