class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        int max=1;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,count);
            if(nums[i]>nums[i+1]){
                count++;
            }
            else{count=1;}
            max=Math.max(max,count);
        }
        count=1;
        
        int max_dec=1;
        for(int i=0;i<nums.length-1;i++){
            max_dec=Math.max(max_dec,count);
            if(nums[i]<nums[i+1]){
                count++;
            }
            else{count=1;}
            max=Math.max(max,count);
        }
        return Math.max(max,max_dec);
        
    }
}