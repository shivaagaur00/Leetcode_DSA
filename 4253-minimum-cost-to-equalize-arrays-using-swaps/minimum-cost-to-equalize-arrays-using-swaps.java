class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        Set<Integer> st=new HashSet<>();
        for(int a:nums1){
            st.add(a);
            map1.put(a,map1.getOrDefault(a,0)+1);
        }   
        for(int a:nums2){
            st.add(a);
            map2.put(a,map2.getOrDefault(a,0)+1);
        }
        for(int a:st){
            if((map1.getOrDefault(a,0)+map2.getOrDefault(a,0))%2!=0){
                return -1;
            }
        }
        
        int ans=0;
        for(int a:st){
            ans+=(Math.abs(map1.getOrDefault(a,0)-map2.getOrDefault(a,0)));
        }
        return ans/4;
    }
}