class Solution {
    public boolean canJump(int[] nums) {
        boolean flag=true;
        for(int a:nums){
            if(a==0){
                flag=false;
            }
        }
        if(flag) return true;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max) return false;
            max=Math.max(max,nums[i]+i);
        }
        return true;
    }
}