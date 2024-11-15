class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        int id=0;
        while(id<n-1){
            if(arr[id]<=arr[id+1]) left++;
            else break;
            id++;
        }
        if(left==n-1) return 0;
        while(right>0){
            if(arr[right-1]<=arr[right]) right--;
            else break;
        }
        int ans=Math.min(n-left-1,right);
        int i=0,j=right;
        while(i<=left && j<n){
            if(arr[i]<=arr[j]){
                ans=Math.min(ans,j-i-1);
                i++;
            }
            else j++;
        }
        return ans;
    }
}