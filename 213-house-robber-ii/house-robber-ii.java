
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        int take=func(nums,arr,0,n-2);
        Arrays.fill(arr,-1);
        int nottake=func(nums,arr,1,n-1);
        return Math.max(take,nottake);
    }
    public int func(int[] nums,int[] arr,int i,int j){
        if(i>j) return 0;
        if(arr[i]!=-1) return arr[i];
        int take=nums[i]+func(nums,arr,i+2,j);
        int nottake=func(nums,arr,i+1,j);
        arr[i]=Math.max(take,nottake);
        return arr[i];
    }
}