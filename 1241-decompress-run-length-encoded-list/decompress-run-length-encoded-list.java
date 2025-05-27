class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int i=0;
        while(2*i+1<nums.length){
            int f=nums[2*i];
            int v=nums[2*i+1];
            for(int k=0;k<f;k++){
                ans.add(v);
            }
            i++;
        }
        int[] arr=new int[ans.size()];
        int l=0;
        for(int a:ans){
            arr[l++]=a;
        }
        return arr;
    }
}