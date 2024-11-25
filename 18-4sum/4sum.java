class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>(i+1) && nums[j]==nums[j-1]) continue;
                int left=j+1,right=n-1;
                while(left<right){
                    long sum=nums[left]+nums[right];
                    sum+=nums[i]+nums[j];
                    if(sum==target){
                        arr.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
                        left++;
                        right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--; 
                    }
                    else if(sum<target) left++;
                    else right--;
                }
            }
        }
        return arr;
    }
}