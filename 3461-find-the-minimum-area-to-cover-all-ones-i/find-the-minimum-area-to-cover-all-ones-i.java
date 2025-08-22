public class Solution {
    public int minimumArea(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int r = grid.length;
        int c = grid[0].length;
        int minR = r, maxR = -1;
        int minC = c, maxC = -1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    if (i < minR) minR = i;
                    if (i > maxR) maxR = i;
                    if (j < minC) minC = j;
                    if (j > maxC) maxC = j;
                }
            }
        }
        if (minR == r) {
            return 0;
        }
        int height = maxR - minR + 1;
        int width = maxC - minC + 1;
        return height * width;
    }
}
