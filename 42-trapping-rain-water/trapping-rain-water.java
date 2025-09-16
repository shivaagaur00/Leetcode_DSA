class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int i = 1;
        int[] left = new int[height.length];
        left[0] = height[0];
        int max=left[0];
        while (i < length) {
            left[i] = Math.max(max, height[i]);
            max=left[i];
            i++;
        }
        int[] right = new int[height.length];
        right[height.length - 1] = height[height.length - 1];
        int k = height.length - 2;
        while (k >= 0) {
            right[k] = Math.max(right[k + 1], height[k]);
            k--;
        }
        int j = 0;
        int ans = 0;
        while (j < height.length) {
            ans += (Math.min(right[j], left[j]) - height[j]);
            j++;
        }
        return ans;
    }
}