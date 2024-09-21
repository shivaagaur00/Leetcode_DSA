class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> arr = new ArrayList<>();
        Arrays.sort(intervals, (a, b) ->{
            if(a[0]==b[0]) return a[1]-b[1];
            else return a[0]-b[0];
        });
        int end = intervals[0][1];
        int start = intervals[0][0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end,intervals[i][1]);
                start=Math.min(start,intervals[i][0]);
            } else {
                int[] a = { start, end };
                arr.add(a);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        int[] a = { start, end };
        arr.add(a);
        int[][] ans = new int[arr.size()][2];
        int j = 0;
        for (int[] ab : arr) {
            ans[j][0] = ab[0];
            ans[j++][1] = ab[1];
        }
        return ans;
    }
}