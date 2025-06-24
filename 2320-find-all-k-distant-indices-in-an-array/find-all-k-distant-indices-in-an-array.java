class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key) temp.add(i);
        }
        for(int i=0;i<n;i++){
            for(int a:temp){
                if(Math.abs(i-a)<=k){
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
}