class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> 
            a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(b[1], a[1])
        );
        int ans = 0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (check(j, i, points)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    // check if points[ii], points[jj] form valid pair
    public boolean check(int ii, int jj, int[][] points) {
        int[] a = points[ii]; // lower point
        int[] b = points[jj]; // upper point
        int n = points.length;

        if (a[0] < b[0] || a[1] > b[1]) return false;

        int minX = Math.min(b[0], a[0]);
        int maxX = Math.max(b[0], a[0]);
        int minY = Math.min(b[1], a[1]);
        int maxY = Math.max(b[1], a[1]);
        if (minX == maxX) {
            for (int i = 0; i < n; i++) {
                if (i == ii || i == jj) continue;
                if (points[i][0] == minX && points[i][1] >= minY && points[i][1] < maxY) {
                    return false;
                }
            }
        }
        else if (minY == maxY) {
            for (int i = 0; i < n; i++) {
                if (i == ii || i == jj) continue;
                if (points[i][1] == minY && points[i][0] >= minX && points[i][0] < maxX) {
                    return false;
                }
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                if (i == ii || i == jj) continue;
                if (points[i][0] >= minX && points[i][0] <= maxX &&
                    points[i][1] >= minY && points[i][1] <= maxY) {
                    return false;
                }
            }
        }
        return true;
    }
}
