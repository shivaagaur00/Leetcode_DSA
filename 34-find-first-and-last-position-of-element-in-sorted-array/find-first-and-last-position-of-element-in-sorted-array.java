class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        boolean flag = true;
        int i=0,j;
        j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if (nums[mid]==target){
                for(int x=mid; x>=0; x--){
                    if(nums[x]==target) arr[0]  =x;
                    else break;
                }
                for(int x=mid; x<nums.length; x++){
                    if(nums[x]==target) arr[1]  =x;
                    else break;
                }
                break;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return arr;
    }
}