class Solution {
    public int numTriplets(int[] nums, int[] nums1) {
        int n=nums.length;
        int m=nums1.length;
        int ans=0;
        Map<Long,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                map.put((long)nums[i]*nums[j],map.getOrDefault((long)nums[i]*nums[j],0)+1);
            }
        }
        System.out.println(map);
        for(int a:nums1){
            ans+=map.getOrDefault((long)a*a,0);
        }
        // System.out.println(ans);
        map.clear();
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                map.put((long)nums1[i]*nums1[j],map.getOrDefault((long)nums1[i]*nums1[j],0)+1);
            }
        }
        for(int a:nums){
            ans+=map.getOrDefault((long)a*a,0);
        }
        // System.out.println(ans);
        return ans;
    }
}