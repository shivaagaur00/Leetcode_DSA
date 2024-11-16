class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int idx=0;
        int ans[]=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int max=nums[i];
            for(int j=i+1;j<(i+k) && j<n;j++){
                // System.out.println(0);
                if((nums[j]-nums[j-1])==1) max=Math.max(nums[j],max);
                else{
                    max=-1;
                    break;
                }
                // if(i==3) System.out.println(max+" "+j);
            }
            ans[idx++]=max;
        }
        return ans;
    }
}