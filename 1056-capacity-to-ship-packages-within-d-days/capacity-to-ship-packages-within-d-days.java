class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int j=0;
        int i=Integer.MIN_VALUE;
        for(int a:weights){
            j+=a;
            i=Math.max(i,a);
        }
        int ans=1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int res=func(weights,mid);
            if(res>days) i=mid+1;
            else{
                ans=mid;
                j=mid-1;
            }
        }
        return ans;
    }
    public int func(int arr[],int w){
        int curr=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>w){
                curr=arr[i];
                ans++;
            }
        }
        if(curr>0) ans++;
        return ans;
    }
}