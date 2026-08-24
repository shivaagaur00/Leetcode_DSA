class Solution {
    public String triangleType(int[] nums) {
        if (!isTriangle(nums)) return "none";
        if (isEquilateral(nums)) return "equilateral";
        if (isIsosceles(nums)) return "isosceles";
        return "scalene";
    }

    public boolean isTriangle(int[] nums) {
        return nums[0] + nums[1] > nums[2] &&
               nums[0] + nums[2] > nums[1] &&
               nums[1] + nums[2] > nums[0];
    }

    public boolean isEquilateral(int[] nums) {
        return nums[0] == nums[1] && nums[1] == nums[2];
    }

    public boolean isIsosceles(int[] nums) {
        return nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2];
    }
}