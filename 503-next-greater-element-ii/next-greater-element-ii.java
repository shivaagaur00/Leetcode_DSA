class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=next(i,nums);
        }
        return ans;
       

        
        
    }public int next(int a,int[] arr){
        for(int i=a+1;i<arr.length;i++){
            if(arr[i]>arr[a]){
                return arr[i];
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]>arr[a]){
                return arr[i];
            }
        }
        return -1;

    }
}