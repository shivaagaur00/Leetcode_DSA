class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=n;
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                ans[k]=nums[i++];
            }
            else{
                ans[k]=nums[j++];
            }
        }
        return ans;
    }
}