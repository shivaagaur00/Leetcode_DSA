class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,ans=0,count=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]==0){
                count++;
            }
            while(count>k){
                if(nums[i]==0) count--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            // System.out.println(i+" "+j+" "+ans+" "+count);
            j++;
        }
        // ans=Math.max(ans,j-i+1);
        return ans;
    }
}