class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zero = 0;
        int ans = 0;
        for (int j = 0; j < n - 1; j++) {
            if (nums[j] == 1) {
                j = j + 1;
                int max_one = 1;
                while (j < n && nums[j] == 1) {
                    max_one++;
                    j++;
                }
                if (j < n && nums[j] == 0)
                    zero++;
                ans = Math.max(ans, max_one);
            } else
                zero++;
        }
        if (nums[n - 1] == 0) zero++;
        if (k == 0) return ans;
        if (zero <= k) return n;
        int i = 0;
        int temp = k;
        List<Integer> arr = new ArrayList<>();
        while (temp > 0 && i < n) {
            if (nums[i] == 0) {
                temp--;
                arr.add(i);
            }
            i++;
        }
        int max = i;
        int prev;
        if (arr.size() > 0 && arr.size() == k)
            prev = arr.get(0);
        else return 0;
        for (; i < n; i++) {
            if (nums[i] == 0 && arr.size() == k) {
                prev = arr.get(0) + 1;
                arr.remove(0);
                max = Math.max(i - prev + 1, max);
                arr.add(i);
            } else if (nums[i] == 0) {
                arr.add(i);
                max = i + 1;
            } else if (nums[i] == 1) {
                max = Math.max(max, i - prev + 1);
            }
        }
        return max;
    }
}