class Solution {
    public int splitArray(int[] nums, int k) {
        int i=0,j=0;
        for(int a:nums){
            i=Math.max(i,a);
            j+=a;
        }
        while(i<=j){
            int mid=i+(j-i)/2;
            if(func(mid,nums,k)){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
    public boolean func(int a,int[]arr,int k){
        int curr=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>a){
                curr=arr[i];
                res++;
            }
            if(res>k) return false;
        }
        if(curr>0) res++;
        return res<=k;
    }
}