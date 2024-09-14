class Solution {
    public int findNthDigit(int n) {
        int start = 1;
        long count = 9;
        int length = 1;
        while (n > length * count) {
            n -= length * count;
            length++;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / length;
        String s = Integer.toString(start);
        return  s.charAt((int) ((n - 1) % length)) - '0';
    }
}
