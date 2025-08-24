class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int l=0;
        int pos=0;
        int count=0;
        int max=0;
        while(i<nums.length){
            if(nums[i]==0){
                count++;
                if(count==2) {
                max=Math.max(max,i-l-1);
                l=pos+1;
                count=1;
                }
                pos=i;
            }
            max=Math.max(max,i-l);
            i++;
        }
        return max;
    }
}