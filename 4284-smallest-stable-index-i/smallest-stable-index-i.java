class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int []arr=new int[nums.length];
       int minValue=Integer.MAX_VALUE;
       for(int i=nums.length-1;i>=0;i--){
        minValue=Math.min(minValue,nums[i]);
        arr[i]=minValue;
       }
       int ans=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        if(max-arr[i]<=k) return i;
       } 
       return -1;
    }
}