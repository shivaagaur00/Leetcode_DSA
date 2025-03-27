class Solution {
    public int partitionDisjoint(int[] nums) {
        int cur=nums[0];
        int poss=nums[0];
        int len =1 ;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<cur){
                len =i+1;
                cur=poss;
            }else{
                poss=Math.max(poss,nums[i]);
            }
        }
        return len;
    }
}