class Solution {
    public int[] searchRange(int[] nums, int tar) {
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        arr[0]=binarySearch(nums,tar,true);
        arr[1]=binarySearch(nums,tar,false);
        return arr;
    }
    public int binarySearch(int[] nums,int tar,boolean flag){
        int i=0,j=nums.length-1;
        int ans=-1;
        while(i<=j){
            int mid=(j-i)/2+i;
            if(nums[mid]<tar){
                i=mid+1;
            }
            else if(nums[mid]>tar){
                j=mid-1;
            }
            else{
                ans=mid;
                if(flag){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
        }
        return ans;
    }
}