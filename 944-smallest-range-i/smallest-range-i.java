class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int a=((nums[nums.length-1]-k)-(nums[0]+k));
        if(a>0) return a;
        else return 0;
    }
}