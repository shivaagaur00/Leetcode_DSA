class Solution {
    public int minDeletion(int[] nums) {
      int count=0;
      int n=nums.length;
      int i=0;
         while (i < n - 1) {
            if ((i-count)%2==0 && nums[i] == nums[i + 1]) {
                count++;
                i++;
            } else {
                i++;
            }
        }
         if ((n-count)%2 == 1) {
            count++;
        }
    return count;
    }
}