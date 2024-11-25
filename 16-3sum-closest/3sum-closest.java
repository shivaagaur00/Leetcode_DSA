class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min=Integer.MAX_VALUE;
        int sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int s=nums[i]+nums[j]+nums[k];
                    if(Math.abs(target-s)<Math.abs(target-sum)){
                        sum=s;
                    }
                }
            }
        }
        return sum;

    }
}