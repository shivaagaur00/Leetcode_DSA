class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        int k=0;
        for(int j=n-1;j>=0;j--){
            ans[k+n]=nums[j];
            k++;
        }
        return ans;
    }
}