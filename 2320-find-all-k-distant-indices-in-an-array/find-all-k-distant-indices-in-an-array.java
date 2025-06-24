class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key) temp.add(i);
        }
        int id=0;
        int nTemp=temp.size();
        Set<Integer> set=new HashSet<>();
        for (int idx : temp) {
            int start = Math.max(0, idx - k);
            int end = Math.min(n - 1, idx + k);
            for (int i = start; i <= end; i++) {
                set.add(i);
            }
            }
        for(int a:set){
            arr.add(a);
        }
        Collections.sort(arr);
        return arr;
    }
}