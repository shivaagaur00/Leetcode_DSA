class Solution {
    public int minimumDeletions(int[] nums) {
        int minX=0;
        int maxX=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
                maxX=i;
            }
            if(min>nums[i]){
                min=nums[i];
                minX=i;
            }
        }
        // System.out.println(minX+" "+maxX);
        int ans=0;
        ans=Math.max(minX+1,maxX+1);
        ans=Math.min(ans,Math.max(n-1-maxX+1,n-minX));
        ans=Math.min(ans,minX+1+n-maxX);
        // System.out.println(ans);
        ans=Math.min(ans,maxX+1+n-minX);
        return ans;
    }
}