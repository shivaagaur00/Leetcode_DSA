
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] arr=new int[nums.length];
        int take=func(nums,arr,0,n-2);
        Arrays.fill(arr,0);
        int nottake=func(nums,arr,1,n-1);
        return Math.max(take,nottake);
    }
    public int func(int[] nums,int[] arr,int i,int j){
        if((j-i)==1){
            return Math.max(nums[i],nums[j]);
        }
        arr[i]=nums[i];
        arr[i+1]=Math.max(nums[i],nums[i+1]);
        for(int id=2;id<=j;id++){
            arr[id]=Math.max((nums[id]+arr[id-2]),arr[id-1]);
        }
        return arr[j];
    }
}