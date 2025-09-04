class Solution {
    public int[] singleNumber(int[] nums) {
     Arrays.sort(nums);
     int[] ans=new int[2];
     int j=0;
     for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            i++;
        }
        else ans[j++]=nums[i];
     }
     if(j<2) ans[j++]=nums[nums.length-1];
     return ans;   
    }
}